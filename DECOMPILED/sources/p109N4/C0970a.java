package p109N4;

/* JADX INFO: renamed from: N4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0970a {

    /* JADX INFO: renamed from: a */
    private int f3710a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0973d.a f3711b = InterfaceC0973d.a.DEFAULT;

    /* JADX INFO: renamed from: N4.a$a */
    private static final class a implements InterfaceC0973d {

        /* JADX INFO: renamed from: a */
        private final int f3712a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0973d.a f3713b;

        a(int i7, InterfaceC0973d.a aVar) {
            this.f3712a = i7;
            this.f3713b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC0973d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC0973d)) {
                return false;
            }
            InterfaceC0973d interfaceC0973d = (InterfaceC0973d) obj;
            return this.f3712a == interfaceC0973d.tag() && this.f3713b.equals(interfaceC0973d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f3712a) + (this.f3713b.hashCode() ^ 2041407134);
        }

        @Override // p109N4.InterfaceC0973d
        public InterfaceC0973d.a intEncoding() {
            return this.f3713b;
        }

        @Override // p109N4.InterfaceC0973d
        public int tag() {
            return this.f3712a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3712a + "intEncoding=" + this.f3713b + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0970a m4222b() {
        return new C0970a();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0973d m4223a() {
        return new a(this.f3710a, this.f3711b);
    }

    /* JADX INFO: renamed from: c */
    public C0970a m4224c(int i7) {
        this.f3710a = i7;
        return this;
    }
}
