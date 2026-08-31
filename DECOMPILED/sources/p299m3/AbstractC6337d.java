package p299m3;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: m3.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6337d {

    /* JADX INFO: renamed from: a */
    public static final C3553a.g f24176a;

    /* JADX INFO: renamed from: b */
    public static final C3553a.g f24177b;

    /* JADX INFO: renamed from: c */
    public static final C3553a.a f24178c;

    /* JADX INFO: renamed from: d */
    static final C3553a.a f24179d;

    /* JADX INFO: renamed from: e */
    public static final Scope f24180e;

    /* JADX INFO: renamed from: f */
    public static final Scope f24181f;

    /* JADX INFO: renamed from: g */
    public static final C3553a f24182g;

    /* JADX INFO: renamed from: h */
    public static final C3553a f24183h;

    static {
        C3553a.g gVar = new C3553a.g();
        f24176a = gVar;
        C3553a.g gVar2 = new C3553a.g();
        f24177b = gVar2;
        C6335b c6335b = new C6335b();
        f24178c = c6335b;
        C6336c c6336c = new C6336c();
        f24179d = c6336c;
        f24180e = new Scope("profile");
        f24181f = new Scope("email");
        f24182g = new C3553a("SignIn.API", c6335b, gVar);
        f24183h = new C3553a("SignIn.INTERNAL_API", c6336c, gVar2);
    }
}
