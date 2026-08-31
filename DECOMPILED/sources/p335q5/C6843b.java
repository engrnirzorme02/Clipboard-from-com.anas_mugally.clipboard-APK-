package p335q5;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p200a4.C2210c;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p200a4.InterfaceC2216i;

/* JADX INFO: renamed from: q5.b */
/* JADX INFO: loaded from: classes.dex */
public class C6843b implements InterfaceC2216i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m29877b(String str, C2210c c2210c, InterfaceC2211d interfaceC2211d) {
        try {
            AbstractC6844c.m29879b(str);
            return c2210c.m8971h().mo2117a(interfaceC2211d);
        } finally {
            AbstractC6844c.m29878a();
        }
    }

    @Override // p200a4.InterfaceC2216i
    /* JADX INFO: renamed from: a */
    public List mo8997a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C2210c c2210cM8978r : componentRegistrar.getComponents()) {
            final String strM8972i = c2210cM8978r.m8972i();
            if (strM8972i != null) {
                c2210cM8978r = c2210cM8978r.m8978r(new InterfaceC2214g() { // from class: q5.a
                    @Override // p200a4.InterfaceC2214g
                    /* JADX INFO: renamed from: a */
                    public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                        return C6843b.m29877b(strM8972i, c2210cM8978r, interfaceC2211d);
                    }
                });
            }
            arrayList.add(c2210cM8978r);
        }
        return arrayList;
    }
}
