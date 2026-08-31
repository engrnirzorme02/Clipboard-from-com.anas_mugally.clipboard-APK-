package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7043y extends AbstractC5136y implements InterfaceC5083V {
    private static final C7043y DEFAULT_INSTANCE;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5063B.e transformResults_ = AbstractC5136y.m23683A();
    private C5125s0 updateTime_;

    /* JADX INFO: renamed from: s5.y$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28180a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28180a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28180a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28180a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28180a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28180a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28180a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28180a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.y$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C7043y.DEFAULT_INSTANCE);
        }
    }

    static {
        C7043y c7043y = new C7043y();
        DEFAULT_INSTANCE = c7043y;
        AbstractC5136y.m23695V(C7043y.class, c7043y);
    }

    private C7043y() {
    }

    /* JADX INFO: renamed from: a0 */
    public C7039u m31118a0(int i7) {
        return (C7039u) this.transformResults_.get(i7);
    }

    /* JADX INFO: renamed from: b0 */
    public int m31119b0() {
        return this.transformResults_.size();
    }

    /* JADX INFO: renamed from: c0 */
    public C5125s0 m31120c0() {
        C5125s0 c5125s0 = this.updateTime_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28180a[dVar.ordinal()]) {
            case 1:
                return new C7043y();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", C7039u.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7043y.class) {
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
