package p112O0;

/* JADX INFO: renamed from: O0.s */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1106s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* JADX INFO: renamed from: c */
    public boolean m4861c() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
