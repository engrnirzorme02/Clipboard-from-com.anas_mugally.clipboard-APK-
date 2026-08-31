package p208b2;

import android.util.SparseArray;

/* JADX INFO: renamed from: b2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2950p {

    /* JADX INFO: renamed from: b2.p$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC2950p mo14730a();

        /* JADX INFO: renamed from: b */
        public abstract a mo14731b(AbstractC2953s abstractC2953s);

        /* JADX INFO: renamed from: c */
        public abstract a mo14732c(b bVar);
    }

    /* JADX INFO: renamed from: b2.p$b */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: d */
        private static final SparseArray f12192d;

        /* JADX INFO: renamed from: a */
        private final int f12194a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            f12192d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i7) {
            this.f12194a = i7;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m14787a() {
        return new C2940f.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC2953s mo14728b();

    /* JADX INFO: renamed from: c */
    public abstract b mo14729c();
}
