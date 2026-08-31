package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5125s0 extends AbstractC5136y implements InterfaceC5083V {
    private static final C5125s0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: renamed from: com.google.protobuf.s0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19530a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f19530a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19530a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19530a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19530a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19530a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19530a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19530a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.s0$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m23587x(int i7) {
            m23724r();
            ((C5125s0) this.f19622b).m23583g0(i7);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m23588y(long j7) {
            m23724r();
            ((C5125s0) this.f19622b).m23584h0(j7);
            return this;
        }

        private b() {
            super(C5125s0.DEFAULT_INSTANCE);
        }
    }

    static {
        C5125s0 c5125s0 = new C5125s0();
        DEFAULT_INSTANCE = c5125s0;
        AbstractC5136y.m23695V(C5125s0.class, c5125s0);
    }

    private C5125s0() {
    }

    /* JADX INFO: renamed from: c0 */
    public static C5125s0 m23581c0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static b m23582f0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m23583g0(int i7) {
        this.nanos_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m23584h0(long j7) {
        this.seconds_ = j7;
    }

    /* JADX INFO: renamed from: d0 */
    public int m23585d0() {
        return this.nanos_;
    }

    /* JADX INFO: renamed from: e0 */
    public long m23586e0() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f19530a[dVar.ordinal()]) {
            case 1:
                return new C5125s0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C5125s0.class) {
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
