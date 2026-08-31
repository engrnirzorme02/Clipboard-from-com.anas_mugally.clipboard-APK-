package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1434l;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2650l {

    /* JADX INFO: renamed from: a */
    private C2638c f10471a = new C2638c(null);

    /* JADX INFO: renamed from: androidx.lifecycle.l$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ InterfaceC2059a $ENTRIES = AbstractC2060b.m8524a(m12629c());
        public static final C7668a Companion = new C7668a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name */
        public static final class C7668a {

            /* JADX INFO: renamed from: androidx.lifecycle.l$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C7669a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f10472a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f10472a = iArr;
                }
            }

            public /* synthetic */ C7668a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m12631a(b state) {
                AbstractC6118n.m27187e(state, "state");
                int i7 = C7669a.f10472a[state.ordinal()];
                if (i7 == 1) {
                    return a.ON_DESTROY;
                }
                if (i7 == 2) {
                    return a.ON_STOP;
                }
                if (i7 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* JADX INFO: renamed from: b */
            public final a m12632b(b state) {
                AbstractC6118n.m27187e(state, "state");
                int i7 = C7669a.f10472a[state.ordinal()];
                if (i7 == 1) {
                    return a.ON_START;
                }
                if (i7 == 2) {
                    return a.ON_RESUME;
                }
                if (i7 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            private C7668a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.l$a$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f10473a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f10473a = iArr;
            }
        }

        /* JADX INFO: renamed from: d */
        public final b m12630d() {
            switch (b.f10473a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new C1434l();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.l$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;


        /* JADX INFO: renamed from: r */
        private static final /* synthetic */ InterfaceC2059a f10480r = AbstractC2060b.m8524a(m12633c());

        /* JADX INFO: renamed from: d */
        public final boolean m12634d(b state) {
            AbstractC6118n.m27187e(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12625a(InterfaceC2656r interfaceC2656r);

    /* JADX INFO: renamed from: b */
    public abstract b mo12626b();

    /* JADX INFO: renamed from: c */
    public final C2638c m12627c() {
        return this.f10471a;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo12628d(InterfaceC2656r interfaceC2656r);
}
