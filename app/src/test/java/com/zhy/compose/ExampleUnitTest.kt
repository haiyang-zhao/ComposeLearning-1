package com.zhy.compose

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer
import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun single_test() {
        val single = Single.create { it.onSuccess(1000) }
        val disposable = single
            .map { "($it : map)" }
            .subscribe { it: String ->
                println(it)
            }
    }

    @Test
    fun rxjava3_test() {
        val observableOnSubscribe = ObservableOnSubscribe { emitter: ObservableEmitter<String> ->
            try {
                if (!emitter.isDisposed) {
                    emitter.onNext("${emitter.hashCode()} Event 1")
                    emitter.onNext("${emitter.hashCode()} Event 2")
                    emitter.onNext("${emitter.hashCode()} Event 3")
                    emitter.onComplete()
                }
            } catch (e: Exception) {
                emitter.onError(e)
            }
        }
        val observable = Observable.create(observableOnSubscribe)
            .map { it }
        val observer1 = createObserver()
        val observer2 = createObserver()
        val consumer = createConsumer()
        observable.subscribe(observer1)
        observable.subscribe(observer2)
        observable.subscribe(consumer)

    }

    fun createObserver(): Observer<String> {
        return object : Observer<String> {
            override fun onSubscribe(d: Disposable) {

            }

            override fun onNext(s: String) {
                System.err.println(s)
            }

            override fun onError(e: Throwable) {

            }

            override fun onComplete() {

            }
        }
    }

    fun createConsumer(): Consumer<String> {
        return Consumer { s: String ->
            System.err.println(s)
        }
    }

}