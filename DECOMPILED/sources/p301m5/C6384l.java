package p301m5;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p164V3.C1762g;
import p164V3.InterfaceC1763h;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p309n5.C6502b;
import p309n5.InterfaceC6503c;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p327p5.C6767j;

/* JADX INFO: renamed from: m5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6384l {

    /* JADX INFO: renamed from: c */
    public static final b f24394c = new b(null);

    /* JADX INFO: renamed from: a */
    private final C1762g f24395a;

    /* JADX INFO: renamed from: b */
    private final C6767j f24396b;

    /* JADX INFO: renamed from: m5.l$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24397a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6363Q f24399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6363Q c6363q, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f24399c = c6363q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6384l.this.new a(this.f24399c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r6.m29584f(r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24397a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C6502b c6502b = C6502b.f24586a;
                this.f24397a = 1;
                obj = c6502b.m27680c(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                AbstractC1437o.m6082b(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            if (C6384l.this.f24396b.m29583c()) {
                C1762g c1762g = C6384l.this.f24395a;
                final C6363Q c6363q = this.f24399c;
                c1762g.m7403h(new InterfaceC1763h() { // from class: m5.k
                });
                C1444v c1444v = C1444v.f4971a;
            } else {
                AbstractC6087b.m27122c(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
            }
            return C1444v.f4971a;
            Collection collectionValues = ((Map) obj).values();
            if (collectionValues == null || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC6503c) it.next()).mo24819b()) {
                            C6767j c6767j = C6384l.this.f24396b;
                            this.f24397a = 2;
                        }
                    }
                }
            }
            AbstractC6087b.m27122c(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: m5.l$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        private b() {
        }
    }

    public C6384l(C1762g firebaseApp, C6767j settings, InterfaceC1879i backgroundDispatcher, C6363Q sessionsActivityLifecycleCallbacks) {
        AbstractC6118n.m27187e(firebaseApp, "firebaseApp");
        AbstractC6118n.m27187e(settings, "settings");
        AbstractC6118n.m27187e(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6118n.m27187e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f24395a = firebaseApp;
        this.f24396b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.2.");
        Context applicationContext = firebaseApp.m7405l().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            AbstractC6672k.m28227d(AbstractC6626O.m28098a(backgroundDispatcher), null, null, new a(sessionsActivityLifecycleCallbacks, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
