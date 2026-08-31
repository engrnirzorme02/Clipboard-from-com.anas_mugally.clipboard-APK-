package p122P3;

/* JADX INFO: renamed from: P3.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1218v {

    /* JADX INFO: renamed from: a */
    private static final AbstractC1218v f4315a = new a();

    /* JADX INFO: renamed from: P3.v$a */
    class a extends AbstractC1218v {
        a() {
        }

        @Override // p122P3.AbstractC1218v
        /* JADX INFO: renamed from: a */
        public long mo5336a() {
            return System.nanoTime();
        }
    }

    protected AbstractC1218v() {
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1218v m5335b() {
        return f4315a;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo5336a();
}
