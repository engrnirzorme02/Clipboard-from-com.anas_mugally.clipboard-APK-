package p122P3;

import java.io.Serializable;

/* JADX INFO: renamed from: P3.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1215s {

    /* JADX INFO: renamed from: P3.s$a */
    static class a implements InterfaceC1214r, Serializable {

        /* JADX INFO: renamed from: a */
        final InterfaceC1214r f4305a;

        /* JADX INFO: renamed from: b */
        volatile transient boolean f4306b;

        /* JADX INFO: renamed from: c */
        transient Object f4307c;

        a(InterfaceC1214r interfaceC1214r) {
            this.f4305a = (InterfaceC1214r) AbstractC1209m.m5302n(interfaceC1214r);
        }

        @Override // p122P3.InterfaceC1214r
        public Object get() {
            if (!this.f4306b) {
                synchronized (this) {
                    try {
                        if (!this.f4306b) {
                            Object obj = this.f4305a.get();
                            this.f4307c = obj;
                            this.f4306b = true;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return AbstractC1204h.m5281a(this.f4307c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f4306b) {
                obj = "<supplier that returned " + this.f4307c + ">";
            } else {
                obj = this.f4305a;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: P3.s$b */
    static class b implements InterfaceC1214r {

        /* JADX INFO: renamed from: c */
        private static final InterfaceC1214r f4308c = new InterfaceC1214r() { // from class: P3.t
            @Override // p122P3.InterfaceC1214r
            public final Object get() {
                return AbstractC1215s.b.m5328a();
            }
        };

        /* JADX INFO: renamed from: a */
        private volatile InterfaceC1214r f4309a;

        /* JADX INFO: renamed from: b */
        private Object f4310b;

        b(InterfaceC1214r interfaceC1214r) {
            this.f4309a = (InterfaceC1214r) AbstractC1209m.m5302n(interfaceC1214r);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Void m5328a() {
            throw new IllegalStateException();
        }

        @Override // p122P3.InterfaceC1214r
        public Object get() {
            InterfaceC1214r interfaceC1214r = this.f4309a;
            InterfaceC1214r interfaceC1214r2 = f4308c;
            if (interfaceC1214r != interfaceC1214r2) {
                synchronized (this) {
                    try {
                        if (this.f4309a != interfaceC1214r2) {
                            Object obj = this.f4309a.get();
                            this.f4310b = obj;
                            this.f4309a = interfaceC1214r2;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return AbstractC1204h.m5281a(this.f4310b);
        }

        public String toString() {
            Object obj = this.f4309a;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == f4308c) {
                obj = "<supplier that returned " + this.f4310b + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: P3.s$c */
    private static class c implements InterfaceC1214r, Serializable {

        /* JADX INFO: renamed from: a */
        final Object f4311a;

        c(Object obj) {
            this.f4311a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return AbstractC1205i.m5282a(this.f4311a, ((c) obj).f4311a);
            }
            return false;
        }

        @Override // p122P3.InterfaceC1214r
        public Object get() {
            return this.f4311a;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f4311a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f4311a + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1214r m5326a(InterfaceC1214r interfaceC1214r) {
        if ((interfaceC1214r instanceof b) || (interfaceC1214r instanceof a)) {
            return interfaceC1214r;
        }
        return interfaceC1214r instanceof Serializable ? new a(interfaceC1214r) : new b(interfaceC1214r);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1214r m5327b(Object obj) {
        return new c(obj);
    }
}
