package p351s5;

import com.google.protobuf.AbstractC5062A0;
import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5075M;
import com.google.protobuf.C5076N;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7041w extends AbstractC5136y implements InterfaceC5083V {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C7041w DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C5076N labels_ = C5076N.m22945d();
    private String database_ = "";
    private String streamId_ = "";
    private AbstractC5063B.e writes_ = AbstractC5136y.m23683A();
    private AbstractC5104i streamToken_ = AbstractC5104i.f19401b;

    /* JADX INFO: renamed from: s5.w$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28177a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28177a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28177a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28177a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28177a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28177a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28177a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28177a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.w$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m31108x(C7040v c7040v) {
            m23724r();
            ((C7041w) this.f19622b).m31102d0(c7040v);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m31109y(String str) {
            m23724r();
            ((C7041w) this.f19622b).m31106h0(str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m31110z(AbstractC5104i abstractC5104i) {
            m23724r();
            ((C7041w) this.f19622b).m31107i0(abstractC5104i);
            return this;
        }

        private b() {
            super(C7041w.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.w$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        static final C5075M f28178a;

        static {
            AbstractC5062A0.b bVar = AbstractC5062A0.b.f19275v;
            f28178a = C5075M.m22938d(bVar, "", bVar, "");
        }
    }

    static {
        C7041w c7041w = new C7041w();
        DEFAULT_INSTANCE = c7041w;
        AbstractC5136y.m23695V(C7041w.class, c7041w);
    }

    private C7041w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m31102d0(C7040v c7040v) {
        c7040v.getClass();
        m31103e0();
        this.writes_.add(c7040v);
    }

    /* JADX INFO: renamed from: e0 */
    private void m31103e0() {
        AbstractC5063B.e eVar = this.writes_;
        if (eVar.mo22849h()) {
            return;
        }
        this.writes_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static C7041w m31104f0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static b m31105g0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m31106h0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m31107i0(AbstractC5104i abstractC5104i) {
        abstractC5104i.getClass();
        this.streamToken_ = abstractC5104i;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28177a[dVar.ordinal()]) {
            case 1:
                return new C7041w();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", C7040v.class, "streamToken_", "labels_", c.f28178a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7041w.class) {
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
