package p318o6;

/* JADX INFO: renamed from: o6.h0 */
/* JADX INFO: loaded from: classes.dex */
final class C6667h0 implements InterfaceC6693u0 {

    /* JADX INFO: renamed from: a */
    private final boolean f24964a;

    public C6667h0(boolean z7) {
        this.f24964a = z7;
    }

    @Override // p318o6.InterfaceC6693u0
    /* JADX INFO: renamed from: a */
    public C6617J0 mo27972a() {
        return null;
    }

    @Override // p318o6.InterfaceC6693u0
    public boolean isActive() {
        return this.f24964a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
