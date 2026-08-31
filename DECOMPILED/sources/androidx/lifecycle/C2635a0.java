package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p230d6.AbstractC5245a;
import p286k6.InterfaceC6077c;
import p304n0.AbstractC6428a;
import p304n0.C6431d;
import p312o0.C6515e;
import p312o0.C6518h;

/* JADX INFO: renamed from: androidx.lifecycle.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C2635a0 {

    /* JADX INFO: renamed from: b */
    public static final b f10443b = new b(null);

    /* JADX INFO: renamed from: c */
    public static final AbstractC6428a.c f10444c;

    /* JADX INFO: renamed from: a */
    private final C6431d f10445a;

    /* JADX INFO: renamed from: androidx.lifecycle.a0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C2635a0 m12598b(b bVar, InterfaceC2639c0 interfaceC2639c0, c cVar, AbstractC6428a abstractC6428a, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                cVar = C6518h.f24643a.m27754b(interfaceC2639c0);
            }
            if ((i7 & 4) != 0) {
                abstractC6428a = C6518h.f24643a.m27753a(interfaceC2639c0);
            }
            return bVar.m12599a(interfaceC2639c0, cVar, abstractC6428a);
        }

        /* JADX INFO: renamed from: a */
        public final C2635a0 m12599a(InterfaceC2639c0 owner, c factory, AbstractC6428a extras) {
            AbstractC6118n.m27187e(owner, "owner");
            AbstractC6118n.m27187e(factory, "factory");
            AbstractC6118n.m27187e(extras, "extras");
            return new C2635a0(owner.mo11963v(), factory, extras);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$c */
    public interface c {

        /* JADX INFO: renamed from: a */
        public static final a f10450a = a.f10451a;

        /* JADX INFO: renamed from: androidx.lifecycle.a0$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            static final /* synthetic */ a f10451a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: a */
        default AbstractC2632Y mo12451a(Class modelClass) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            return C6518h.f24643a.m27756d();
        }

        /* JADX INFO: renamed from: b */
        default AbstractC2632Y mo12562b(InterfaceC6077c modelClass, AbstractC6428a extras) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            AbstractC6118n.m27187e(extras, "extras");
            return mo12570c(AbstractC5245a.m24241a(modelClass), extras);
        }

        /* JADX INFO: renamed from: c */
        default AbstractC2632Y mo12570c(Class modelClass, AbstractC6428a extras) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            AbstractC6118n.m27187e(extras, "extras");
            return mo12451a(modelClass);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$d */
    public static class d implements c {

        /* JADX INFO: renamed from: c */
        private static d f10453c;

        /* JADX INFO: renamed from: b */
        public static final a f10452b = new a(null);

        /* JADX INFO: renamed from: d */
        public static final AbstractC6428a.c f10454d = C2635a0.f10444c;

        /* JADX INFO: renamed from: androidx.lifecycle.a0$d$a */
        public static final class a {
            public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final d m12602a() {
                if (d.f10453c == null) {
                    d.f10453c = new d();
                }
                d dVar = d.f10453c;
                AbstractC6118n.m27184b(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: a */
        public AbstractC2632Y mo12451a(Class modelClass) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            return C6515e.f24638a.m27745a(modelClass);
        }

        @Override // androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: b */
        public AbstractC2632Y mo12562b(InterfaceC6077c modelClass, AbstractC6428a extras) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            AbstractC6118n.m27187e(extras, "extras");
            return mo12570c(AbstractC5245a.m24241a(modelClass), extras);
        }

        @Override // androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: c */
        public AbstractC2632Y mo12570c(Class modelClass, AbstractC6428a extras) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            AbstractC6118n.m27187e(extras, "extras");
            return mo12451a(modelClass);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$e */
    public static class e {
        /* JADX INFO: renamed from: d */
        public abstract void mo12571d(AbstractC2632Y abstractC2632Y);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$f */
    public static final class f implements AbstractC6428a.c {
    }

    static {
        AbstractC6428a.a aVar = AbstractC6428a.f24470b;
        f10444c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2635a0(C2637b0 store, c factory) {
        this(store, factory, null, 4, null);
        AbstractC6118n.m27187e(store, "store");
        AbstractC6118n.m27187e(factory, "factory");
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2632Y m12591a(Class modelClass) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        return m12593c(AbstractC5245a.m24243c(modelClass));
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2632Y m12592b(String key, InterfaceC6077c modelClass) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(modelClass, "modelClass");
        return this.f10445a.m27647d(modelClass, key);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2632Y m12593c(InterfaceC6077c modelClass) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        return C6431d.m27646e(this.f10445a, modelClass, null, 2, null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$a */
    public static class a extends d {

        /* JADX INFO: renamed from: f */
        public static final C7667a f10446f = new C7667a(null);

        /* JADX INFO: renamed from: g */
        private static a f10447g;

        /* JADX INFO: renamed from: h */
        public static final AbstractC6428a.c f10448h;

        /* JADX INFO: renamed from: e */
        private final Application f10449e;

        /* JADX INFO: renamed from: androidx.lifecycle.a0$a$a, reason: collision with other inner class name */
        public static final class C7667a {
            public /* synthetic */ C7667a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m12597a(Application application) {
                AbstractC6118n.m27187e(application, "application");
                if (a.f10447g == null) {
                    a.f10447g = new a(application);
                }
                a aVar = a.f10447g;
                AbstractC6118n.m27184b(aVar);
                return aVar;
            }

            private C7667a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.a0$a$b */
        public static final class b implements AbstractC6428a.c {
        }

        static {
            AbstractC6428a.a aVar = AbstractC6428a.f24470b;
            f10448h = new b();
        }

        private a(Application application, int i7) {
            this.f10449e = application;
        }

        /* JADX INFO: renamed from: h */
        private final AbstractC2632Y m12596h(Class cls, Application application) {
            if (!AbstractC2634a.class.isAssignableFrom(cls)) {
                return super.mo12451a(cls);
            }
            try {
                AbstractC2632Y abstractC2632Y = (AbstractC2632Y) cls.getConstructor(Application.class).newInstance(application);
                AbstractC6118n.m27184b(abstractC2632Y);
                return abstractC2632Y;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        }

        @Override // androidx.lifecycle.C2635a0.d, androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: a */
        public AbstractC2632Y mo12451a(Class modelClass) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            Application application = this.f10449e;
            if (application != null) {
                return m12596h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C2635a0.d, androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: c */
        public AbstractC2632Y mo12570c(Class modelClass, AbstractC6428a extras) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            AbstractC6118n.m27187e(extras, "extras");
            if (this.f10449e != null) {
                return mo12451a(modelClass);
            }
            Application application = (Application) extras.mo27640a(f10448h);
            if (application != null) {
                return m12596h(modelClass, application);
            }
            if (AbstractC2634a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.mo12451a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC6118n.m27187e(application, "application");
        }
    }

    private C2635a0(C6431d c6431d) {
        this.f10445a = c6431d;
    }

    public /* synthetic */ C2635a0(C2637b0 c2637b0, c cVar, AbstractC6428a abstractC6428a, int i7, AbstractC6112h abstractC6112h) {
        this(c2637b0, cVar, (i7 & 4) != 0 ? AbstractC6428a.b.f24472c : abstractC6428a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2635a0(C2637b0 store, c factory, AbstractC6428a defaultCreationExtras) {
        this(new C6431d(store, factory, defaultCreationExtras));
        AbstractC6118n.m27187e(store, "store");
        AbstractC6118n.m27187e(factory, "factory");
        AbstractC6118n.m27187e(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2635a0(InterfaceC2639c0 owner) {
        AbstractC6118n.m27187e(owner, "owner");
        C2637b0 c2637b0Mo11963v = owner.mo11963v();
        C6518h c6518h = C6518h.f24643a;
        this(c2637b0Mo11963v, c6518h.m27754b(owner), c6518h.m27753a(owner));
    }
}
