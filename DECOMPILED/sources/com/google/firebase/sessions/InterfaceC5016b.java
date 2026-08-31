package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.InterfaceC5016b;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p164V3.C1762g;
import p167W.AbstractC1798a;
import p173W5.InterfaceC1879i;
import p174X.C1900d;
import p174X.C1906j;
import p174X.C1921y;
import p174X.InterfaceC1885E;
import p174X.InterfaceC1905i;
import p181Y.C2009b;
import p211b5.InterfaceC2972b;
import p219c5.InterfaceC3022e;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p301m5.C6351E;
import p301m5.C6352F;
import p301m5.C6356J;
import p301m5.C6370Y;
import p301m5.C6373a0;
import p301m5.C6374b;
import p301m5.C6384l;
import p301m5.InterfaceC6365T;
import p301m5.InterfaceC6369X;
import p301m5.InterfaceC6371Z;
import p318o6.AbstractC6626O;
import p318o6.InterfaceC6624N;
import p327p5.C6765h;
import p327p5.C6766i;

/* JADX INFO: renamed from: com.google.firebase.sessions.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5016b {

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC5016b mo22555a();

        /* JADX INFO: renamed from: b */
        a mo22556b(C1762g c1762g);

        /* JADX INFO: renamed from: c */
        a mo22557c(InterfaceC1879i interfaceC1879i);

        /* JADX INFO: renamed from: d */
        a mo22558d(InterfaceC2972b interfaceC2972b);

        /* JADX INFO: renamed from: e */
        a mo22559e(InterfaceC1879i interfaceC1879i);

        /* JADX INFO: renamed from: f */
        a mo22560f(InterfaceC3022e interfaceC3022e);

        /* JADX INFO: renamed from: g */
        a mo22561g(Context context);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$b */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final a f19025a = a.f19026a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            static final /* synthetic */ a f19026a = new a();

            private a() {
            }

            /* JADX INFO: renamed from: f */
            private final InterfaceC1905i m22575f(InterfaceC1885E interfaceC1885E, C2009b c2009b, List list, InterfaceC6624N interfaceC6624N, InterfaceC5356a interfaceC5356a) {
                return m22577h() ? C1921y.f6360a.m7952a(interfaceC1885E, c2009b, list, interfaceC6624N, interfaceC5356a) : C1906j.f6125a.m7852a(interfaceC1885E, c2009b, list, interfaceC6624N, interfaceC5356a);
            }

            /* JADX INFO: renamed from: g */
            static /* synthetic */ InterfaceC1905i m22576g(a aVar, InterfaceC1885E interfaceC1885E, C2009b c2009b, List list, InterfaceC6624N interfaceC6624N, InterfaceC5356a interfaceC5356a, int i7, Object obj) {
                if ((i7 & 4) != 0) {
                    list = AbstractC1638q.m6765j();
                }
                return aVar.m22575f(interfaceC1885E, c2009b, list, interfaceC6624N, interfaceC5356a);
            }

            /* JADX INFO: renamed from: h */
            private final boolean m22577h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: j */
            public static final C6765h m22578j(C1900d ex) {
                AbstractC6118n.m27187e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return C6766i.f27182a.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: k */
            public static final File m22579k(Context context) {
                return AbstractC1798a.m7509a(context, "aqs/sessionConfigsDataStore.data");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: m */
            public static final C6351E m22580m(C6352F c6352f, C1900d ex) {
                AbstractC6118n.m27187e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return c6352f.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: n */
            public static final File m22581n(Context context) {
                return AbstractC1798a.m7509a(context, "aqs/sessionDataStore.data");
            }

            /* JADX INFO: renamed from: e */
            public final C6374b m22582e(C1762g firebaseApp) {
                AbstractC6118n.m27187e(firebaseApp, "firebaseApp");
                return C6356J.f24229a.m27404b(firebaseApp);
            }

            /* JADX INFO: renamed from: i */
            public final InterfaceC1905i m22583i(final Context appContext, InterfaceC1879i blockingDispatcher) {
                AbstractC6118n.m27187e(appContext, "appContext");
                AbstractC6118n.m27187e(blockingDispatcher, "blockingDispatcher");
                return m22576g(this, C6766i.f27182a, new C2009b(new InterfaceC5367l() { // from class: m5.m
                    @Override // p238e6.InterfaceC5367l
                    public final Object invoke(Object obj) {
                        return InterfaceC5016b.b.a.m22578j((C1900d) obj);
                    }
                }), null, AbstractC6626O.m28098a(blockingDispatcher), new InterfaceC5356a() { // from class: m5.n
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return InterfaceC5016b.b.a.m22579k(appContext);
                    }
                }, 4, null);
            }

            /* JADX INFO: renamed from: l */
            public final InterfaceC1905i m22584l(final Context appContext, InterfaceC1879i blockingDispatcher, final C6352F sessionDataSerializer) {
                AbstractC6118n.m27187e(appContext, "appContext");
                AbstractC6118n.m27187e(blockingDispatcher, "blockingDispatcher");
                AbstractC6118n.m27187e(sessionDataSerializer, "sessionDataSerializer");
                return m22576g(this, sessionDataSerializer, new C2009b(new InterfaceC5367l() { // from class: m5.o
                    @Override // p238e6.InterfaceC5367l
                    public final Object invoke(Object obj) {
                        return InterfaceC5016b.b.a.m22580m(sessionDataSerializer, (C1900d) obj);
                    }
                }), null, AbstractC6626O.m28098a(blockingDispatcher), new InterfaceC5356a() { // from class: m5.p
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return InterfaceC5016b.b.a.m22581n(appContext);
                    }
                }, 4, null);
            }

            /* JADX INFO: renamed from: o */
            public final InterfaceC6369X m22585o() {
                return C6370Y.f24322a;
            }

            /* JADX INFO: renamed from: p */
            public final InterfaceC6371Z m22586p() {
                return C6373a0.f24329a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    C6384l mo22569a();

    /* JADX INFO: renamed from: b */
    InterfaceC6365T mo22570b();
}
