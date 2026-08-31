package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5138z extends AbstractC5136y implements InterfaceC5083V {
    private static final C5138z DEFAULT_INSTANCE;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: renamed from: com.google.protobuf.z$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19656a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f19656a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19656a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19656a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19656a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19656a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19656a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19656a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.z$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m23808x(int i7) {
            m23724r();
            ((C5138z) this.f19622b).m23806e0(i7);
            return this;
        }

        private b() {
            super(C5138z.DEFAULT_INSTANCE);
        }
    }

    static {
        C5138z c5138z = new C5138z();
        DEFAULT_INSTANCE = c5138z;
        AbstractC5136y.m23695V(C5138z.class, c5138z);
    }

    private C5138z() {
    }

    /* JADX INFO: renamed from: b0 */
    public static C5138z m23804b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public static b m23805d0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m23806e0(int i7) {
        this.value_ = i7;
    }

    /* JADX INFO: renamed from: c0 */
    public int m23807c0() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f19656a[dVar.ordinal()]) {
            case 1:
                return new C5138z();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C5138z.class) {
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
