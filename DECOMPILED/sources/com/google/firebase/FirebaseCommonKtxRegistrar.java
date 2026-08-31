package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p178X3.InterfaceC1950a;
import p178X3.InterfaceC1951b;
import p178X3.InterfaceC1952c;
import p178X3.InterfaceC1953d;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6687r0;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$a */
    public static final class C4802a implements InterfaceC2214g {

        /* JADX INFO: renamed from: a */
        public static final C4802a f18405a = new C4802a();

        @Override // p200a4.InterfaceC2214g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC6618K mo2117a(InterfaceC2211d interfaceC2211d) {
            Object objMo8954b = interfaceC2211d.mo8954b(C2206E.m8951a(InterfaceC1950a.class, Executor.class));
            AbstractC6118n.m27186d(objMo8954b, "get(...)");
            return AbstractC6687r0.m28283a((Executor) objMo8954b);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$b */
    public static final class C4803b implements InterfaceC2214g {

        /* JADX INFO: renamed from: a */
        public static final C4803b f18406a = new C4803b();

        @Override // p200a4.InterfaceC2214g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC6618K mo2117a(InterfaceC2211d interfaceC2211d) {
            Object objMo8954b = interfaceC2211d.mo8954b(C2206E.m8951a(InterfaceC1952c.class, Executor.class));
            AbstractC6118n.m27186d(objMo8954b, "get(...)");
            return AbstractC6687r0.m28283a((Executor) objMo8954b);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$c */
    public static final class C4804c implements InterfaceC2214g {

        /* JADX INFO: renamed from: a */
        public static final C4804c f18407a = new C4804c();

        @Override // p200a4.InterfaceC2214g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC6618K mo2117a(InterfaceC2211d interfaceC2211d) {
            Object objMo8954b = interfaceC2211d.mo8954b(C2206E.m8951a(InterfaceC1951b.class, Executor.class));
            AbstractC6118n.m27186d(objMo8954b, "get(...)");
            return AbstractC6687r0.m28283a((Executor) objMo8954b);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$d */
    public static final class C4805d implements InterfaceC2214g {

        /* JADX INFO: renamed from: a */
        public static final C4805d f18408a = new C4805d();

        @Override // p200a4.InterfaceC2214g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC6618K mo2117a(InterfaceC2211d interfaceC2211d) {
            Object objMo8954b = interfaceC2211d.mo8954b(C2206E.m8951a(InterfaceC1953d.class, Executor.class));
            AbstractC6118n.m27186d(objMo8954b, "get(...)");
            return AbstractC6687r0.m28283a((Executor) objMo8954b);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        C2210c c2210cM8985d = C2210c.m8963c(C2206E.m8951a(InterfaceC1950a.class, AbstractC6618K.class)).m8983b(C2224q.m9032k(C2206E.m8951a(InterfaceC1950a.class, Executor.class))).m8987f(C4802a.f18405a).m8985d();
        AbstractC6118n.m27186d(c2210cM8985d, "build(...)");
        C2210c c2210cM8985d2 = C2210c.m8963c(C2206E.m8951a(InterfaceC1952c.class, AbstractC6618K.class)).m8983b(C2224q.m9032k(C2206E.m8951a(InterfaceC1952c.class, Executor.class))).m8987f(C4803b.f18406a).m8985d();
        AbstractC6118n.m27186d(c2210cM8985d2, "build(...)");
        C2210c c2210cM8985d3 = C2210c.m8963c(C2206E.m8951a(InterfaceC1951b.class, AbstractC6618K.class)).m8983b(C2224q.m9032k(C2206E.m8951a(InterfaceC1951b.class, Executor.class))).m8987f(C4804c.f18407a).m8985d();
        AbstractC6118n.m27186d(c2210cM8985d3, "build(...)");
        C2210c c2210cM8985d4 = C2210c.m8963c(C2206E.m8951a(InterfaceC1953d.class, AbstractC6618K.class)).m8983b(C2224q.m9032k(C2206E.m8951a(InterfaceC1953d.class, Executor.class))).m8987f(C4805d.f18408a).m8985d();
        AbstractC6118n.m27186d(c2210cM8985d4, "build(...)");
        return AbstractC1638q.m6767l(c2210cM8985d, c2210cM8985d2, c2210cM8985d3, c2210cM8985d4);
    }
}
