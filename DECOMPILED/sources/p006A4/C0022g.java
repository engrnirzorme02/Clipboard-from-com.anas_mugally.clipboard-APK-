package p006A4;

import java.util.ArrayList;
import java.util.List;
import p022C4.C0144c;
import p374v4.AbstractC7241f;
import p374v4.InterfaceC7244i;

/* JADX INFO: renamed from: A4.g */
/* JADX INFO: loaded from: classes.dex */
public class C0022g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7244i f115a;

    /* JADX INFO: renamed from: b */
    private final C0144c f116b;

    /* JADX INFO: renamed from: A4.g$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f117a;

        a(ArrayList arrayList) {
            this.f117a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (InterfaceC0020e interfaceC0020e : this.f117a) {
                if (C0022g.this.f116b.m627f()) {
                    C0022g.this.f116b.m624b("Raising " + interfaceC0020e.toString(), new Object[0]);
                }
                interfaceC0020e.mo90a();
            }
        }
    }

    public C0022g(AbstractC7241f abstractC7241f) {
        this.f115a = abstractC7241f.m31971o();
        this.f116b = abstractC7241f.m31972q("EventRaiser");
    }

    /* JADX INFO: renamed from: b */
    public void m115b(List list) {
        if (this.f116b.m627f()) {
            this.f116b.m624b("Raising " + list.size() + " event(s)", new Object[0]);
        }
        this.f115a.mo30265b(new a(new ArrayList(list)));
    }
}
