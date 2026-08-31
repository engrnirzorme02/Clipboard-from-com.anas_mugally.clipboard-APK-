package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7042x extends AbstractC5136y implements InterfaceC5083V {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final C7042x DEFAULT_INSTANCE;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private C5125s0 commitTime_;
    private String streamId_ = "";
    private AbstractC5104i streamToken_ = AbstractC5104i.f19401b;
    private AbstractC5063B.e writeResults_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.x$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28179a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28179a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28179a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28179a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28179a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28179a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28179a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28179a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.x$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C7042x.DEFAULT_INSTANCE);
        }
    }

    static {
        C7042x c7042x = new C7042x();
        DEFAULT_INSTANCE = c7042x;
        AbstractC5136y.m23695V(C7042x.class, c7042x);
    }

    private C7042x() {
    }

    /* JADX INFO: renamed from: b0 */
    public static C7042x m31112b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public C5125s0 m31113a0() {
        C5125s0 c5125s0 = this.commitTime_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    /* JADX INFO: renamed from: c0 */
    public AbstractC5104i m31114c0() {
        return this.streamToken_;
    }

    /* JADX INFO: renamed from: d0 */
    public C7043y m31115d0(int i7) {
        return (C7043y) this.writeResults_.get(i7);
    }

    /* JADX INFO: renamed from: e0 */
    public int m31116e0() {
        return this.writeResults_.size();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28179a[dVar.ordinal()]) {
            case 1:
                return new C7042x();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", C7043y.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7042x.class) {
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
