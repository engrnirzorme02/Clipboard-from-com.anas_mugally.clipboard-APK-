package p112O0;

/* JADX INFO: renamed from: O0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1096i {

    /* JADX INFO: renamed from: O0.i$a */
    class a extends AbstractC1096i {
        a() {
        }

        @Override // p112O0.AbstractC1096i
        /* JADX INFO: renamed from: a */
        public AbstractC1095h mo4842a(String str) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1096i m4841c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1095h mo4842a(String str);

    /* JADX INFO: renamed from: b */
    public final AbstractC1095h m4843b(String str) {
        AbstractC1095h abstractC1095hMo4842a = mo4842a(str);
        return abstractC1095hMo4842a == null ? AbstractC1095h.m4839a(str) : abstractC1095hMo4842a;
    }
}
