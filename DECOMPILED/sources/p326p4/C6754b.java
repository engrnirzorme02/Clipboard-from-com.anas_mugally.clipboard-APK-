package p326p4;

/* JADX INFO: renamed from: p4.b */
/* JADX INFO: loaded from: classes.dex */
public class C6754b implements InterfaceC6756d {

    /* JADX INFO: renamed from: a */
    private final int f27133a;

    public C6754b(int i7) {
        this.f27133a = i7;
    }

    @Override // p326p4.InterfaceC6756d
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo29540a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i7 = this.f27133a;
        if (length <= i7) {
            return stackTraceElementArr;
        }
        int i8 = i7 / 2;
        int i9 = i7 - i8;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i7];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i9);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i8, stackTraceElementArr2, i9, i8);
        return stackTraceElementArr2;
    }
}
