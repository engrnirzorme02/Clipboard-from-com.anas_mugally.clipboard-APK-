package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.y */
/* JADX INFO: loaded from: classes.dex */
final class C5894y extends AbstractC5868F.e.d.f {

    /* JADX INFO: renamed from: a */
    private final List f23446a;

    /* JADX INFO: renamed from: j4.y$b */
    static final class b extends AbstractC5868F.e.d.f.a {

        /* JADX INFO: renamed from: a */
        private List f23447a;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.f.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.f mo26593a() {
            List list = this.f23447a;
            if (list != null) {
                return new C5894y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // p276j4.AbstractC5868F.e.d.f.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.f.a mo26594b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f23447a = list;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.f
    /* JADX INFO: renamed from: b */
    public List mo26592b() {
        return this.f23446a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.f) {
            return this.f23446a.equals(((AbstractC5868F.e.d.f) obj).mo26592b());
        }
        return false;
    }

    public int hashCode() {
        return this.f23446a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f23446a + "}";
    }

    private C5894y(List list) {
        this.f23446a = list;
    }
}
