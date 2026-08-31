package p326p4;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: loaded from: classes.dex */
public class C6753a implements InterfaceC6756d {

    /* JADX INFO: renamed from: a */
    private final int f27130a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6756d[] f27131b;

    /* JADX INFO: renamed from: c */
    private final C6754b f27132c;

    public C6753a(int i7, InterfaceC6756d... interfaceC6756dArr) {
        this.f27130a = i7;
        this.f27131b = interfaceC6756dArr;
        this.f27132c = new C6754b(i7);
    }

    @Override // p326p4.InterfaceC6756d
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo29540a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f27130a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrMo29540a = stackTraceElementArr;
        for (InterfaceC6756d interfaceC6756d : this.f27131b) {
            if (stackTraceElementArrMo29540a.length <= this.f27130a) {
                break;
            }
            stackTraceElementArrMo29540a = interfaceC6756d.mo29540a(stackTraceElementArr);
        }
        return stackTraceElementArrMo29540a.length > this.f27130a ? this.f27132c.mo29540a(stackTraceElementArrMo29540a) : stackTraceElementArrMo29540a;
    }
}
