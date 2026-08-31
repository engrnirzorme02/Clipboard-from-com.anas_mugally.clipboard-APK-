package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p178X3.InterfaceC1950a;
import p178X3.InterfaceC1951b;
import p178X3.InterfaceC1952c;
import p178X3.InterfaceC1953d;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2230w;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p211b5.InterfaceC2972b;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    static final C2230w f18564a = new C2230w(new InterfaceC2972b() { // from class: b4.a
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return ExecutorsRegistrar.m22076m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m22074k("Firebase Background", 10, ExecutorsRegistrar.m22072i())));
        }
    });

    /* JADX INFO: renamed from: b */
    static final C2230w f18565b = new C2230w(new InterfaceC2972b() { // from class: b4.b
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return ExecutorsRegistrar.m22076m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m22074k("Firebase Lite", 0, ExecutorsRegistrar.m22075l())));
        }
    });

    /* JADX INFO: renamed from: c */
    static final C2230w f18566c = new C2230w(new InterfaceC2972b() { // from class: b4.c
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return ExecutorsRegistrar.m22076m(Executors.newCachedThreadPool(ExecutorsRegistrar.m22073j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d */
    static final C2230w f18567d = new C2230w(new InterfaceC2972b() { // from class: b4.d
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m22073j("Firebase Scheduler", 0));
        }
    });

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ScheduledExecutorService m22064a(InterfaceC2211d interfaceC2211d) {
        return (ScheduledExecutorService) f18565b.get();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ScheduledExecutorService m22068e(InterfaceC2211d interfaceC2211d) {
        return (ScheduledExecutorService) f18566c.get();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ScheduledExecutorService m22070g(InterfaceC2211d interfaceC2211d) {
        return (ScheduledExecutorService) f18564a.get();
    }

    /* JADX INFO: renamed from: i */
    private static StrictMode.ThreadPolicy m22072i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    /* JADX INFO: renamed from: j */
    private static ThreadFactory m22073j(String str, int i7) {
        return new ThreadFactoryC4887b(str, i7, null);
    }

    /* JADX INFO: renamed from: k */
    private static ThreadFactory m22074k(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC4887b(str, i7, threadPolicy);
    }

    /* JADX INFO: renamed from: l */
    private static StrictMode.ThreadPolicy m22075l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static ScheduledExecutorService m22076m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC4900o(executorService, (ScheduledExecutorService) f18567d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C2210c.m8964d(C2206E.m8951a(InterfaceC1950a.class, ScheduledExecutorService.class), C2206E.m8951a(InterfaceC1950a.class, ExecutorService.class), C2206E.m8951a(InterfaceC1950a.class, Executor.class)).m8987f(new InterfaceC2214g() { // from class: b4.e
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return ExecutorsRegistrar.m22070g(interfaceC2211d);
            }
        }).m8985d(), C2210c.m8964d(C2206E.m8951a(InterfaceC1951b.class, ScheduledExecutorService.class), C2206E.m8951a(InterfaceC1951b.class, ExecutorService.class), C2206E.m8951a(InterfaceC1951b.class, Executor.class)).m8987f(new InterfaceC2214g() { // from class: b4.f
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return ExecutorsRegistrar.m22068e(interfaceC2211d);
            }
        }).m8985d(), C2210c.m8964d(C2206E.m8951a(InterfaceC1952c.class, ScheduledExecutorService.class), C2206E.m8951a(InterfaceC1952c.class, ExecutorService.class), C2206E.m8951a(InterfaceC1952c.class, Executor.class)).m8987f(new InterfaceC2214g() { // from class: b4.g
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return ExecutorsRegistrar.m22064a(interfaceC2211d);
            }
        }).m8985d(), C2210c.m8963c(C2206E.m8951a(InterfaceC1953d.class, Executor.class)).m8987f(new InterfaceC2214g() { // from class: b4.h
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return EnumC2970k.INSTANCE;
            }
        }).m8985d());
    }
}
