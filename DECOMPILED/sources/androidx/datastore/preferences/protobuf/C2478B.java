package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.B */
/* JADX INFO: loaded from: classes.dex */
final class C2478B implements InterfaceC2501Z {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC2485I f9426b = new a();

    /* JADX INFO: renamed from: a */
    private final InterfaceC2485I f9427a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.B$a */
    class a implements InterfaceC2485I {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2485I
        /* JADX INFO: renamed from: a */
        public InterfaceC2484H mo10862a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2485I
        /* JADX INFO: renamed from: b */
        public boolean mo10863b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.B$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9428a;

        static {
            int[] iArr = new int[EnumC2495T.values().length];
            f9428a = iArr;
            try {
                iArr[EnumC2495T.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.B$c */
    private static class c implements InterfaceC2485I {

        /* JADX INFO: renamed from: a */
        private InterfaceC2485I[] f9429a;

        c(InterfaceC2485I... interfaceC2485IArr) {
            this.f9429a = interfaceC2485IArr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2485I
        /* JADX INFO: renamed from: a */
        public InterfaceC2484H mo10862a(Class cls) {
            for (InterfaceC2485I interfaceC2485I : this.f9429a) {
                if (interfaceC2485I.mo10863b(cls)) {
                    return interfaceC2485I.mo10862a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2485I
        /* JADX INFO: renamed from: b */
        public boolean mo10863b(Class cls) {
            for (InterfaceC2485I interfaceC2485I : this.f9429a) {
                if (interfaceC2485I.mo10863b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2478B() {
        this(m10857c());
    }

    /* JADX INFO: renamed from: b */
    private static boolean m10856b(InterfaceC2484H interfaceC2484H) {
        return b.f9428a[interfaceC2484H.mo10895c().ordinal()] != 1;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC2485I m10857c() {
        return new c(C2532s.m11598c(), m10858d());
    }

    /* JADX INFO: renamed from: d */
    private static InterfaceC2485I m10858d() {
        if (C2496U.f9472d) {
            return f9426b;
        }
        try {
            return (InterfaceC2485I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f9426b;
        }
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC2500Y m10859e(Class cls, InterfaceC2484H interfaceC2484H) {
        if (m10860f(cls)) {
            return C2489M.m10920N(cls, interfaceC2484H, AbstractC2493Q.m10982b(), AbstractC2477A.m10854b(), AbstractC2503a0.m11053K(), m10856b(interfaceC2484H) ? AbstractC2529p.m11569b() : null, AbstractC2483G.m10891b());
        }
        InterfaceC2491O interfaceC2491OM10981a = AbstractC2493Q.m10981a();
        AbstractC2527n abstractC2527nM11568a = null;
        InterfaceC2538y interfaceC2538yM10853a = AbstractC2477A.m10853a();
        AbstractC2513f0 abstractC2513f0M11052J = AbstractC2503a0.m11052J();
        if (m10856b(interfaceC2484H)) {
            abstractC2527nM11568a = AbstractC2529p.m11568a();
        }
        return C2489M.m10920N(cls, interfaceC2484H, interfaceC2491OM10981a, interfaceC2538yM10853a, abstractC2513f0M11052J, abstractC2527nM11568a, AbstractC2483G.m10890a());
    }

    /* JADX INFO: renamed from: f */
    private static boolean m10860f(Class cls) {
        return C2496U.f9472d || AbstractC2533t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2501Z
    /* JADX INFO: renamed from: a */
    public InterfaceC2500Y mo10861a(Class cls) {
        AbstractC2503a0.m11049G(cls);
        InterfaceC2484H interfaceC2484HMo10862a = this.f9427a.mo10862a(cls);
        if (interfaceC2484HMo10862a.mo10893a()) {
            return m10860f(cls) ? C2490N.m10977l(AbstractC2503a0.m11053K(), AbstractC2529p.m11569b(), interfaceC2484HMo10862a.mo10894b()) : C2490N.m10977l(AbstractC2503a0.m11052J(), AbstractC2529p.m11568a(), interfaceC2484HMo10862a.mo10894b());
        }
        return m10859e(cls, interfaceC2484HMo10862a);
    }

    private C2478B(InterfaceC2485I interfaceC2485I) {
        this.f9427a = (InterfaceC2485I) AbstractC2534u.m11638b(interfaceC2485I, "messageInfoFactory");
    }
}
