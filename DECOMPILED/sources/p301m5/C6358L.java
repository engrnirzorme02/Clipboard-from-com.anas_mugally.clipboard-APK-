package p301m5;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p164V3.C1762g;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p219c5.InterfaceC3022e;
import p238e6.InterfaceC5371p;
import p309n5.C6502b;
import p309n5.InterfaceC6503c;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p327p5.C6767j;

/* JADX INFO: renamed from: m5.L */
/* JADX INFO: loaded from: classes.dex */
public final class C6358L implements InterfaceC6357K {

    /* JADX INFO: renamed from: f */
    public static final a f24231f = new a(null);

    /* JADX INFO: renamed from: g */
    private static final double f24232g = Math.random();

    /* JADX INFO: renamed from: a */
    private final C1762g f24233a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3022e f24234b;

    /* JADX INFO: renamed from: c */
    private final C6767j f24235c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6380h f24236d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1879i f24237e;

    /* JADX INFO: renamed from: m5.L$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: m5.L$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f24238a;

        /* JADX INFO: renamed from: b */
        Object f24239b;

        /* JADX INFO: renamed from: c */
        Object f24240c;

        /* JADX INFO: renamed from: d */
        Object f24241d;

        /* JADX INFO: renamed from: e */
        Object f24242e;

        /* JADX INFO: renamed from: f */
        Object f24243f;

        /* JADX INFO: renamed from: r */
        int f24244r;

        /* JADX INFO: renamed from: t */
        final /* synthetic */ C6354H f24246t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6354H c6354h, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f24246t = c6354h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6358L.this.new b(this.f24246t, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            C6392t c6392t;
            C6358L c6358l;
            C6356J c6356j;
            C1762g c1762g;
            C6354H c6354h;
            C6767j c6767j;
            Object objM27680c;
            C1762g c1762g2;
            C6354H c6354h2;
            C6356J c6356j2;
            C6767j c6767j2;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24244r;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C6358L c6358l2 = C6358L.this;
                this.f24244r = 1;
                obj = c6358l2.m27414i(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                AbstractC1437o.m6082b(obj);
            } else {
                if (i7 == 2) {
                    AbstractC1437o.m6082b(obj);
                    c6392t = (C6392t) obj;
                    c6358l = C6358L.this;
                    c6356j = C6356J.f24229a;
                    c1762g = c6358l.f24233a;
                    c6354h = this.f24246t;
                    c6767j = C6358L.this.f24235c;
                    C6502b c6502b = C6502b.f24586a;
                    this.f24238a = c6392t;
                    this.f24239b = c6358l;
                    this.f24240c = c6356j;
                    this.f24241d = c1762g;
                    this.f24242e = c6354h;
                    this.f24243f = c6767j;
                    this.f24244r = 3;
                    objM27680c = c6502b.m27680c(this);
                    if (objM27680c != objE) {
                        c1762g2 = c1762g;
                        obj = objM27680c;
                        c6354h2 = c6354h;
                        c6356j2 = c6356j;
                        c6767j2 = c6767j;
                    }
                    return objE;
                }
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6767j c6767j3 = (C6767j) this.f24243f;
                C6354H c6354h3 = (C6354H) this.f24242e;
                C1762g c1762g3 = (C1762g) this.f24241d;
                C6356J c6356j3 = (C6356J) this.f24240c;
                c6358l = (C6358L) this.f24239b;
                c6392t = (C6392t) this.f24238a;
                AbstractC1437o.m6082b(obj);
                c6767j2 = c6767j3;
                c6356j2 = c6356j3;
                c6354h2 = c6354h3;
                c1762g2 = c1762g3;
            }
            C6358L c6358l3 = c6358l;
            Map map = (Map) obj;
            C6392t c6392t2 = c6392t;
            c6358l3.m27412g(c6356j2.m27403a(c1762g2, c6354h2, c6767j2, map, c6392t2.m27507b(), c6392t2.m27506a()));
            return C1444v.f4971a;
            if (((Boolean) obj).booleanValue()) {
                C6392t.a aVar = C6392t.f24407c;
                InterfaceC3022e interfaceC3022e = C6358L.this.f24234b;
                this.f24244r = 2;
                obj = aVar.m27508a(interfaceC3022e, this);
                if (obj != objE) {
                    c6392t = (C6392t) obj;
                    c6358l = C6358L.this;
                    c6356j = C6356J.f24229a;
                    c1762g = c6358l.f24233a;
                    c6354h = this.f24246t;
                    c6767j = C6358L.this.f24235c;
                    C6502b c6502b2 = C6502b.f24586a;
                    this.f24238a = c6392t;
                    this.f24239b = c6358l;
                    this.f24240c = c6356j;
                    this.f24241d = c1762g;
                    this.f24242e = c6354h;
                    this.f24243f = c6767j;
                    this.f24244r = 3;
                    objM27680c = c6502b2.m27680c(this);
                    if (objM27680c != objE) {
                        c1762g2 = c1762g;
                        obj = objM27680c;
                        c6354h2 = c6354h;
                        c6356j2 = c6356j;
                        c6767j2 = c6767j;
                        C6358L c6358l4 = c6358l;
                        Map map2 = (Map) obj;
                        C6392t c6392t3 = c6392t;
                        c6358l4.m27412g(c6356j2.m27403a(c1762g2, c6354h2, c6767j2, map2, c6392t3.m27507b(), c6392t3.m27506a()));
                    }
                }
                return objE;
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: m5.L$c */
    static final class c extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f24247a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f24248b;

        /* JADX INFO: renamed from: d */
        int f24250d;

        c(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f24248b = obj;
            this.f24250d |= Integer.MIN_VALUE;
            return C6358L.this.m27414i(this);
        }
    }

    public C6358L(C1762g firebaseApp, InterfaceC3022e firebaseInstallations, C6767j sessionSettings, InterfaceC6380h eventGDTLogger, InterfaceC1879i backgroundDispatcher) {
        AbstractC6118n.m27187e(firebaseApp, "firebaseApp");
        AbstractC6118n.m27187e(firebaseInstallations, "firebaseInstallations");
        AbstractC6118n.m27187e(sessionSettings, "sessionSettings");
        AbstractC6118n.m27187e(eventGDTLogger, "eventGDTLogger");
        AbstractC6118n.m27187e(backgroundDispatcher, "backgroundDispatcher");
        this.f24233a = firebaseApp;
        this.f24234b = firebaseInstallations;
        this.f24235c = sessionSettings;
        this.f24236d = eventGDTLogger;
        this.f24237e = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m27412g(C6355I c6355i) {
        try {
            this.f24236d.mo27495a(c6355i);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e7) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e7);
        }
    }

    /* JADX INFO: renamed from: h */
    private final boolean m27413h() {
        return f24232g <= this.f24235c.m29581a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m27414i(InterfaceC1875e interfaceC1875e) {
        c cVar;
        C6358L c6358l;
        C6358L c6358l2;
        if (interfaceC1875e instanceof c) {
            cVar = (c) interfaceC1875e;
            int i7 = cVar.f24250d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar.f24250d = i7 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC1875e);
            }
        } else {
            cVar = new c(interfaceC1875e);
        }
        Object objM27680c = cVar.f24248b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = cVar.f24250d;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM27680c);
            C6502b c6502b = C6502b.f24586a;
            cVar.f24247a = this;
            cVar.f24250d = 1;
            objM27680c = c6502b.m27680c(cVar);
            if (objM27680c != objE) {
                c6358l = this;
            }
            return objE;
        }
        if (i8 == 1) {
            c6358l = (C6358L) cVar.f24247a;
            AbstractC1437o.m6082b(objM27680c);
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6358l2 = (C6358L) cVar.f24247a;
            AbstractC1437o.m6082b(objM27680c);
        }
        if (!c6358l2.f24235c.m29583c()) {
            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
            return AbstractC6087b.m27120a(false);
        }
        if (!c6358l2.m27413h()) {
            return AbstractC6087b.m27120a(true);
        }
        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
        return AbstractC6087b.m27120a(false);
        Collection collectionValues = ((Map) objM27680c).values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!((InterfaceC6503c) it.next()).mo24819b());
            C6767j c6767j = c6358l.f24235c;
            cVar.f24247a = c6358l;
            cVar.f24250d = 2;
            if (c6767j.m29584f(cVar) != objE) {
                c6358l2 = c6358l;
                if (!c6358l2.f24235c.m29583c()) {
                    Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                    return AbstractC6087b.m27120a(false);
                }
                if (!c6358l2.m27413h()) {
                    return AbstractC6087b.m27120a(true);
                }
                Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                return AbstractC6087b.m27120a(false);
            }
            return objE;
        }
        Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
        return AbstractC6087b.m27120a(false);
    }

    @Override // p301m5.InterfaceC6357K
    /* JADX INFO: renamed from: a */
    public void mo27406a(C6354H sessionDetails) {
        AbstractC6118n.m27187e(sessionDetails, "sessionDetails");
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(this.f24237e), null, null, new b(sessionDetails, null), 3, null);
    }
}
