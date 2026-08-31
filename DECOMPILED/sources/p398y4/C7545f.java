package p398y4;

/* JADX INFO: renamed from: y4.f */
/* JADX INFO: loaded from: classes.dex */
public class C7545f implements InterfaceC7540a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7540a f30189a;

    /* JADX INFO: renamed from: b */
    private long f30190b;

    public C7545f(InterfaceC7540a interfaceC7540a, long j7) {
        this.f30189a = interfaceC7540a;
        this.f30190b = j7;
    }

    @Override // p398y4.InterfaceC7540a
    /* JADX INFO: renamed from: a */
    public long mo33182a() {
        return this.f30189a.mo33182a() + this.f30190b;
    }

    /* JADX INFO: renamed from: b */
    public void m33210b(long j7) {
        this.f30190b = j7;
    }
}
