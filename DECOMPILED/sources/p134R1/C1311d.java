package p134R1;

import android.content.Context;

/* JADX INFO: renamed from: R1.d */
/* JADX INFO: loaded from: classes.dex */
final class C1311d implements InterfaceC1309b {

    /* JADX INFO: renamed from: a */
    private final Context f4598a;

    /* JADX INFO: renamed from: b */
    final InterfaceC1309b.a f4599b;

    C1311d(Context context, InterfaceC1309b.a aVar) {
        this.f4598a = context.getApplicationContext();
        this.f4599b = aVar;
    }

    /* JADX INFO: renamed from: k */
    private void m5652k() {
        C1325r.m5677a(this.f4598a).m5680d(this.f4599b);
    }

    /* JADX INFO: renamed from: l */
    private void m5653l() {
        C1325r.m5677a(this.f4598a).m5681e(this.f4599b);
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: a */
    public void mo5654a() {
        m5652k();
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: e */
    public void mo5655e() {
        m5653l();
    }

    @Override // p134R1.InterfaceC1319l
    public void onDestroy() {
    }
}
