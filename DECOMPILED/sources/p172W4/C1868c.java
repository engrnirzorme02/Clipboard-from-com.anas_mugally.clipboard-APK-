package p172W4;

import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import p351s5.C7037s;

/* JADX INFO: renamed from: W4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1868c extends AbstractC5136y implements InterfaceC5083V {
    private static final C1868c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C5125s0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private C5125s0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC5104i resumeToken_ = AbstractC5104i.f19401b;

    /* JADX INFO: renamed from: W4.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6029a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f6029a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6029a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6029a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6029a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6029a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6029a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6029a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: W4.c$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m7722A(long j7) {
            m23724r();
            ((C1868c) this.f19622b).m7709v0(j7);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m7723B(C7037s.d dVar) {
            m23724r();
            ((C1868c) this.f19622b).m7710w0(dVar);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m7724C(AbstractC5104i abstractC5104i) {
            m23724r();
            ((C1868c) this.f19622b).m7711x0(abstractC5104i);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m7725D(C5125s0 c5125s0) {
            m23724r();
            ((C1868c) this.f19622b).m7712y0(c5125s0);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m7726E(int i7) {
            m23724r();
            ((C1868c) this.f19622b).m7713z0(i7);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m7727x() {
            m23724r();
            ((C1868c) this.f19622b).m7704i0();
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m7728y(C7037s.c cVar) {
            m23724r();
            ((C1868c) this.f19622b).m7707t0(cVar);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m7729z(C5125s0 c5125s0) {
            m23724r();
            ((C1868c) this.f19622b).m7708u0(c5125s0);
            return this;
        }

        private b() {
            super(C1868c.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: W4.c$c */
    public enum c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f6034a;

        c(int i7) {
            this.f6034a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m7731d(int i7) {
            if (i7 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i7 == 5) {
                return QUERY;
            }
            if (i7 != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        C1868c c1868c = new C1868c();
        DEFAULT_INSTANCE = c1868c;
        AbstractC5136y.m23695V(C1868c.class, c1868c);
    }

    private C1868c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m7704i0() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: renamed from: r0 */
    public static b m7705r0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: s0 */
    public static C1868c m7706s0(byte[] bArr) {
        return (C1868c) AbstractC5136y.m23691R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m7707t0(C7037s.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m7708u0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.lastLimboFreeSnapshotVersion_ = c5125s0;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public void m7709v0(long j7) {
        this.lastListenSequenceNumber_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public void m7710w0(C7037s.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m7711x0(AbstractC5104i abstractC5104i) {
        abstractC5104i.getClass();
        this.resumeToken_ = abstractC5104i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m7712y0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.snapshotVersion_ = c5125s0;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m7713z0(int i7) {
        this.targetId_ = i7;
    }

    /* JADX INFO: renamed from: j0 */
    public C7037s.c m7714j0() {
        return this.targetTypeCase_ == 6 ? (C7037s.c) this.targetType_ : C7037s.c.m30983d0();
    }

    /* JADX INFO: renamed from: k0 */
    public C5125s0 m7715k0() {
        C5125s0 c5125s0 = this.lastLimboFreeSnapshotVersion_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    /* JADX INFO: renamed from: l0 */
    public long m7716l0() {
        return this.lastListenSequenceNumber_;
    }

    /* JADX INFO: renamed from: m0 */
    public C7037s.d m7717m0() {
        return this.targetTypeCase_ == 5 ? (C7037s.d) this.targetType_ : C7037s.d.m30991c0();
    }

    /* JADX INFO: renamed from: n0 */
    public AbstractC5104i m7718n0() {
        return this.resumeToken_;
    }

    /* JADX INFO: renamed from: o0 */
    public C5125s0 m7719o0() {
        C5125s0 c5125s0 = this.snapshotVersion_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    /* JADX INFO: renamed from: p0 */
    public int m7720p0() {
        return this.targetId_;
    }

    /* JADX INFO: renamed from: q0 */
    public c m7721q0() {
        return c.m7731d(this.targetTypeCase_);
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f6029a[dVar.ordinal()]) {
            case 1:
                return new C1868c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", C7037s.d.class, C7037s.c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C1868c.class) {
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
