package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p164V3.C1762g;
import p173W5.InterfaceC1879i;
import p174X.C1921y;
import p178X3.InterfaceC1950a;
import p178X3.InterfaceC1951b;
import p198a2.InterfaceC2194j;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p211b5.InterfaceC2972b;
import p219c5.InterfaceC3022e;
import p285k5.AbstractC6073h;
import p301m5.C6384l;
import p318o6.AbstractC6618K;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final C5014a Companion = new C5014a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C2206E appContext;
    private static final C2206E backgroundDispatcher;
    private static final C2206E blockingDispatcher;
    private static final C2206E firebaseApp;
    private static final C2206E firebaseInstallationsApi;
    private static final C2206E firebaseSessionsComponent;
    private static final C2206E transportFactory;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsRegistrar$a */
    private static final class C5014a {
        public /* synthetic */ C5014a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C5014a() {
        }
    }

    static {
        C2206E c2206eM8952b = C2206E.m8952b(Context.class);
        AbstractC6118n.m27186d(c2206eM8952b, "unqualified(...)");
        appContext = c2206eM8952b;
        C2206E c2206eM8952b2 = C2206E.m8952b(C1762g.class);
        AbstractC6118n.m27186d(c2206eM8952b2, "unqualified(...)");
        firebaseApp = c2206eM8952b2;
        C2206E c2206eM8952b3 = C2206E.m8952b(InterfaceC3022e.class);
        AbstractC6118n.m27186d(c2206eM8952b3, "unqualified(...)");
        firebaseInstallationsApi = c2206eM8952b3;
        C2206E c2206eM8951a = C2206E.m8951a(InterfaceC1950a.class, AbstractC6618K.class);
        AbstractC6118n.m27186d(c2206eM8951a, "qualified(...)");
        backgroundDispatcher = c2206eM8951a;
        C2206E c2206eM8951a2 = C2206E.m8951a(InterfaceC1951b.class, AbstractC6618K.class);
        AbstractC6118n.m27186d(c2206eM8951a2, "qualified(...)");
        blockingDispatcher = c2206eM8951a2;
        C2206E c2206eM8952b4 = C2206E.m8952b(InterfaceC2194j.class);
        AbstractC6118n.m27186d(c2206eM8952b4, "unqualified(...)");
        transportFactory = c2206eM8952b4;
        C2206E c2206eM8952b5 = C2206E.m8952b(InterfaceC5016b.class);
        AbstractC6118n.m27186d(c2206eM8952b5, "unqualified(...)");
        firebaseSessionsComponent = c2206eM8952b5;
        try {
            C1921y.f6360a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6384l getComponents$lambda$0(InterfaceC2211d interfaceC2211d) {
        return ((InterfaceC5016b) interfaceC2211d.mo8954b(firebaseSessionsComponent)).mo22569a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5016b getComponents$lambda$1(InterfaceC2211d interfaceC2211d) {
        InterfaceC5016b.a aVarM22554a = AbstractC5015a.m22554a();
        Object objMo8954b = interfaceC2211d.mo8954b(appContext);
        AbstractC6118n.m27186d(objMo8954b, "get(...)");
        InterfaceC5016b.a aVarMo22561g = aVarM22554a.mo22561g((Context) objMo8954b);
        Object objMo8954b2 = interfaceC2211d.mo8954b(backgroundDispatcher);
        AbstractC6118n.m27186d(objMo8954b2, "get(...)");
        InterfaceC5016b.a aVarMo22557c = aVarMo22561g.mo22557c((InterfaceC1879i) objMo8954b2);
        Object objMo8954b3 = interfaceC2211d.mo8954b(blockingDispatcher);
        AbstractC6118n.m27186d(objMo8954b3, "get(...)");
        InterfaceC5016b.a aVarMo22559e = aVarMo22557c.mo22559e((InterfaceC1879i) objMo8954b3);
        Object objMo8954b4 = interfaceC2211d.mo8954b(firebaseApp);
        AbstractC6118n.m27186d(objMo8954b4, "get(...)");
        InterfaceC5016b.a aVarMo22556b = aVarMo22559e.mo22556b((C1762g) objMo8954b4);
        Object objMo8954b5 = interfaceC2211d.mo8954b(firebaseInstallationsApi);
        AbstractC6118n.m27186d(objMo8954b5, "get(...)");
        InterfaceC5016b.a aVarMo22560f = aVarMo22556b.mo22560f((InterfaceC3022e) objMo8954b5);
        InterfaceC2972b interfaceC2972bMo8957f = interfaceC2211d.mo8957f(transportFactory);
        AbstractC6118n.m27186d(interfaceC2972bMo8957f, "getProvider(...)");
        return aVarMo22560f.mo22558d(interfaceC2972bMo8957f).mo22555a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        return AbstractC1638q.m6767l(C2210c.m8965e(C6384l.class).m8988h(LIBRARY_NAME).m8983b(C2224q.m9032k(firebaseSessionsComponent)).m8987f(new InterfaceC2214g() { // from class: m5.q
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC2211d);
            }
        }).m8986e().m8985d(), C2210c.m8965e(InterfaceC5016b.class).m8988h("fire-sessions-component").m8983b(C2224q.m9032k(appContext)).m8983b(C2224q.m9032k(backgroundDispatcher)).m8983b(C2224q.m9032k(blockingDispatcher)).m8983b(C2224q.m9032k(firebaseApp)).m8983b(C2224q.m9032k(firebaseInstallationsApi)).m8983b(C2224q.m9034m(transportFactory)).m8987f(new InterfaceC2214g() { // from class: m5.r
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC2211d);
            }
        }).m8985d(), AbstractC6073h.m27112b(LIBRARY_NAME, "3.0.2"));
    }
}
