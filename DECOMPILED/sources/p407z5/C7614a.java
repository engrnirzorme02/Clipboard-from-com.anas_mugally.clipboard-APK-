package p407z5;

import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: z5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7614a extends AbstractC5136y implements InterfaceC5083V {
    private static final C7614a DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC5097e0 PARSER;
    private double latitude_;
    private double longitude_;

    /* JADX INFO: renamed from: z5.a$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30297a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f30297a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30297a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30297a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30297a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30297a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30297a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30297a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: z5.a$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m33394x(double d7) {
            m23724r();
            ((C7614a) this.f19622b).m33390g0(d7);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m33395y(double d7) {
            m23724r();
            ((C7614a) this.f19622b).m33391h0(d7);
            return this;
        }

        private b() {
            super(C7614a.DEFAULT_INSTANCE);
        }
    }

    static {
        C7614a c7614a = new C7614a();
        DEFAULT_INSTANCE = c7614a;
        AbstractC5136y.m23695V(C7614a.class, c7614a);
    }

    private C7614a() {
    }

    /* JADX INFO: renamed from: c0 */
    public static C7614a m33388c0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static b m33389f0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m33390g0(double d7) {
        this.latitude_ = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m33391h0(double d7) {
        this.longitude_ = d7;
    }

    /* JADX INFO: renamed from: d0 */
    public double m33392d0() {
        return this.latitude_;
    }

    /* JADX INFO: renamed from: e0 */
    public double m33393e0() {
        return this.longitude_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f30297a[dVar.ordinal()]) {
            case 1:
                return new C7614a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7614a.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC5136y.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
