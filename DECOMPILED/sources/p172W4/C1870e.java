package p172W4;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import p351s5.C7040v;

/* JADX INFO: renamed from: W4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1870e extends AbstractC5136y implements InterfaceC5083V {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final C1870e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private C5125s0 localWriteTime_;
    private AbstractC5063B.e writes_ = AbstractC5136y.m23683A();
    private AbstractC5063B.e baseWrites_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: W4.e$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6036a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f6036a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6036a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6036a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6036a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6036a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6036a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6036a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: W4.e$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m7763A(C5125s0 c5125s0) {
            m23724r();
            ((C1870e) this.f19622b).m7756s0(c5125s0);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m7764x(C7040v c7040v) {
            m23724r();
            ((C1870e) this.f19622b).m7748e0(c7040v);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m7765y(C7040v c7040v) {
            m23724r();
            ((C1870e) this.f19622b).m7749f0(c7040v);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m7766z(int i7) {
            m23724r();
            ((C1870e) this.f19622b).m7755r0(i7);
            return this;
        }

        private b() {
            super(C1870e.DEFAULT_INSTANCE);
        }
    }

    static {
        C1870e c1870e = new C1870e();
        DEFAULT_INSTANCE = c1870e;
        AbstractC5136y.m23695V(C1870e.class, c1870e);
    }

    private C1870e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m7748e0(C7040v c7040v) {
        c7040v.getClass();
        m7750g0();
        this.baseWrites_.add(c7040v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public void m7749f0(C7040v c7040v) {
        c7040v.getClass();
        m7751h0();
        this.writes_.add(c7040v);
    }

    /* JADX INFO: renamed from: g0 */
    private void m7750g0() {
        AbstractC5063B.e eVar = this.baseWrites_;
        if (eVar.mo22849h()) {
            return;
        }
        this.baseWrites_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: h0 */
    private void m7751h0() {
        AbstractC5063B.e eVar = this.writes_;
        if (eVar.mo22849h()) {
            return;
        }
        this.writes_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: o0 */
    public static b m7752o0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: p0 */
    public static C1870e m7753p0(AbstractC5104i abstractC5104i) {
        return (C1870e) AbstractC5136y.m23689P(DEFAULT_INSTANCE, abstractC5104i);
    }

    /* JADX INFO: renamed from: q0 */
    public static C1870e m7754q0(byte[] bArr) {
        return (C1870e) AbstractC5136y.m23691R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public void m7755r0(int i7) {
        this.batchId_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m7756s0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.localWriteTime_ = c5125s0;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: i0 */
    public C7040v m7757i0(int i7) {
        return (C7040v) this.baseWrites_.get(i7);
    }

    /* JADX INFO: renamed from: j0 */
    public int m7758j0() {
        return this.baseWrites_.size();
    }

    /* JADX INFO: renamed from: k0 */
    public int m7759k0() {
        return this.batchId_;
    }

    /* JADX INFO: renamed from: l0 */
    public C5125s0 m7760l0() {
        C5125s0 c5125s0 = this.localWriteTime_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    /* JADX INFO: renamed from: m0 */
    public C7040v m7761m0(int i7) {
        return (C7040v) this.writes_.get(i7);
    }

    /* JADX INFO: renamed from: n0 */
    public int m7762n0() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f6036a[dVar.ordinal()]) {
            case 1:
                return new C1870e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", C7040v.class, "localWriteTime_", "baseWrites_", C7040v.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C1870e.class) {
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
