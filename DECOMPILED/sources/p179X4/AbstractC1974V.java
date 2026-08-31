package p179X4;

import com.google.protobuf.AbstractC5104i;
import java.util.List;
import p063H5.C0554l0;
import p158U4.C1687k;
import p158U4.C1694r;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: X4.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1974V {

    /* JADX INFO: renamed from: X4.V$b */
    public static final class b extends AbstractC1974V {

        /* JADX INFO: renamed from: a */
        private final List f6521a;

        /* JADX INFO: renamed from: b */
        private final List f6522b;

        /* JADX INFO: renamed from: c */
        private final C1687k f6523c;

        /* JADX INFO: renamed from: d */
        private final C1694r f6524d;

        public b(List list, List list2, C1687k c1687k, C1694r c1694r) {
            super();
            this.f6521a = list;
            this.f6522b = list2;
            this.f6523c = c1687k;
            this.f6524d = c1694r;
        }

        /* JADX INFO: renamed from: a */
        public C1687k m8257a() {
            return this.f6523c;
        }

        /* JADX INFO: renamed from: b */
        public C1694r m8258b() {
            return this.f6524d;
        }

        /* JADX INFO: renamed from: c */
        public List m8259c() {
            return this.f6522b;
        }

        /* JADX INFO: renamed from: d */
        public List m8260d() {
            return this.f6521a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (!this.f6521a.equals(bVar.f6521a) || !this.f6522b.equals(bVar.f6522b) || !this.f6523c.equals(bVar.f6523c)) {
                    return false;
                }
                C1694r c1694r = this.f6524d;
                C1694r c1694r2 = bVar.f6524d;
                if (c1694r != null) {
                    return c1694r.equals(c1694r2);
                }
                if (c1694r2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((((this.f6521a.hashCode() * 31) + this.f6522b.hashCode()) * 31) + this.f6523c.hashCode()) * 31;
            C1694r c1694r = this.f6524d;
            return iHashCode + (c1694r != null ? c1694r.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f6521a + ", removedTargetIds=" + this.f6522b + ", key=" + this.f6523c + ", newDocument=" + this.f6524d + '}';
        }
    }

    /* JADX INFO: renamed from: X4.V$c */
    public static final class c extends AbstractC1974V {

        /* JADX INFO: renamed from: a */
        private final int f6525a;

        /* JADX INFO: renamed from: b */
        private final C1993p f6526b;

        public c(int i7, C1993p c1993p) {
            super();
            this.f6525a = i7;
            this.f6526b = c1993p;
        }

        /* JADX INFO: renamed from: a */
        public C1993p m8261a() {
            return this.f6526b;
        }

        /* JADX INFO: renamed from: b */
        public int m8262b() {
            return this.f6525a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f6525a + ", existenceFilter=" + this.f6526b + '}';
        }
    }

    /* JADX INFO: renamed from: X4.V$d */
    public static final class d extends AbstractC1974V {

        /* JADX INFO: renamed from: a */
        private final e f6527a;

        /* JADX INFO: renamed from: b */
        private final List f6528b;

        /* JADX INFO: renamed from: c */
        private final AbstractC5104i f6529c;

        /* JADX INFO: renamed from: d */
        private final C0554l0 f6530d;

        public d(e eVar, List list, AbstractC5104i abstractC5104i, C0554l0 c0554l0) {
            super();
            AbstractC2034b.m8460d(c0554l0 == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f6527a = eVar;
            this.f6528b = list;
            this.f6529c = abstractC5104i;
            if (c0554l0 == null || c0554l0.m2460o()) {
                this.f6530d = null;
            } else {
                this.f6530d = c0554l0;
            }
        }

        /* JADX INFO: renamed from: a */
        public C0554l0 m8263a() {
            return this.f6530d;
        }

        /* JADX INFO: renamed from: b */
        public e m8264b() {
            return this.f6527a;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC5104i m8265c() {
            return this.f6529c;
        }

        /* JADX INFO: renamed from: d */
        public List m8266d() {
            return this.f6528b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f6527a != dVar.f6527a || !this.f6528b.equals(dVar.f6528b) || !this.f6529c.equals(dVar.f6529c)) {
                    return false;
                }
                C0554l0 c0554l0 = this.f6530d;
                if (c0554l0 != null) {
                    return dVar.f6530d != null && c0554l0.m2458m().equals(dVar.f6530d.m2458m());
                }
                if (dVar.f6530d == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((((this.f6527a.hashCode() * 31) + this.f6528b.hashCode()) * 31) + this.f6529c.hashCode()) * 31;
            C0554l0 c0554l0 = this.f6530d;
            return iHashCode + (c0554l0 != null ? c0554l0.m2458m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f6527a + ", targetIds=" + this.f6528b + '}';
        }
    }

    /* JADX INFO: renamed from: X4.V$e */
    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private AbstractC1974V() {
    }
}
