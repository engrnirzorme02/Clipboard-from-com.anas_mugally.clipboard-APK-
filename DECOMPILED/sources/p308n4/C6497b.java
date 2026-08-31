package p308n4;

import android.content.Context;
import com.google.android.datatransport.cct.C3236a;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;
import p198a2.InterfaceC2194j;
import p216c2.C3005u;
import p252g4.AbstractC5516z;
import p252g4.C5475M;
import p276j4.AbstractC5868F;
import p284k4.C6065j;
import p316o4.InterfaceC6589j;

/* JADX INFO: renamed from: n4.b */
/* JADX INFO: loaded from: classes.dex */
public class C6497b {

    /* JADX INFO: renamed from: c */
    private static final C6065j f24558c = new C6065j();

    /* JADX INFO: renamed from: d */
    private static final String f24559d = m27657d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e */
    private static final String f24560e = m27657d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f */
    private static final InterfaceC2192h f24561f = new InterfaceC2192h() { // from class: n4.a
        @Override // p198a2.InterfaceC2192h
        public final Object apply(Object obj) {
            return C6497b.f24558c.m27098M((AbstractC5868F) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* JADX INFO: renamed from: a */
    private final C6500e f24562a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2192h f24563b;

    C6497b(C6500e c6500e, InterfaceC2192h interfaceC2192h) {
        this.f24562a = c6500e;
        this.f24563b = interfaceC2192h;
    }

    /* JADX INFO: renamed from: b */
    public static C6497b m27656b(Context context, InterfaceC6589j interfaceC6589j, C5475M c5475m) {
        C3005u.m14973f(context);
        InterfaceC2194j interfaceC2194jM14975g = C3005u.m14971c().m14975g(new C3236a(f24559d, f24560e));
        C2187c c2187cM8925b = C2187c.m8925b("json");
        InterfaceC2192h interfaceC2192h = f24561f;
        return new C6497b(new C6500e(interfaceC2194jM14975g.mo8933a("FIREBASE_CRASHLYTICS_REPORT", AbstractC5868F.class, c2187cM8925b, interfaceC2192h), interfaceC6589j.mo27919b(), c5475m), interfaceC2192h);
    }

    /* JADX INFO: renamed from: d */
    private static String m27657d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb.append(str2.charAt(i7));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public Task m27658c(AbstractC5516z abstractC5516z, boolean z7) {
        return this.f24562a.m27672i(abstractC5516z, z7).getTask();
    }
}
