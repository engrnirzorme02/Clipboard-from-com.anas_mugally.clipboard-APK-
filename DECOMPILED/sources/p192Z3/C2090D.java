package p192Z3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.internal.p411firebaseauthapi.zzaen;
import com.google.android.gms.internal.p411firebaseauthapi.zzah;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C4861j0;
import com.google.firebase.auth.FirebaseAuth;
import p177X2.AbstractC1949e;

/* JADX INFO: renamed from: Z3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2090D {

    /* JADX INFO: renamed from: d */
    private static final zzah f6881d = zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* JADX INFO: renamed from: e */
    private static final C2090D f6882e = new C2090D();

    /* JADX INFO: renamed from: a */
    private Task f6883a;

    /* JADX INFO: renamed from: b */
    private Task f6884b;

    /* JADX INFO: renamed from: c */
    private long f6885c = 0;

    private C2090D() {
    }

    /* JADX INFO: renamed from: b */
    public static void m8627b(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.m17744U());
        editorEdit.putString("statusMessage", status.m17745V());
        editorEdit.putLong("timestamp", C3753h.m18171d().mo18159a());
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m8628c(Context context, zzajb zzajbVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", AbstractC1949e.m8084f(zzajbVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", C3753h.m18171d().mo18159a());
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: d */
    public static void m8629d(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong("timestamp", C3753h.m18171d().mo18159a());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    private static void m8630e(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzah zzahVar = f6881d;
        int size = zzahVar.size();
        int i7 = 0;
        while (i7 < size) {
            E e7 = zzahVar.get(i7);
            i7++;
            editorEdit.remove((String) e7);
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: g */
    public static C2090D m8631g() {
        return f6882e;
    }

    /* JADX INFO: renamed from: a */
    public final void m8632a(Context context) {
        AbstractC3718s.m18083l(context);
        m8630e(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f6883a = null;
        this.f6885c = 0L;
    }

    /* JADX INFO: renamed from: f */
    public final void m8633f(FirebaseAuth firebaseAuth) {
        AbstractC3718s.m18083l(firebaseAuth);
        byte b7 = 0;
        SharedPreferences sharedPreferences = firebaseAuth.m21988d().m7405l().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.m21988d().m7406o().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (sharedPreferences.contains("recaptchaToken")) {
                    String string = sharedPreferences.getString("recaptchaToken", "");
                    String string2 = sharedPreferences.getString("operation", "");
                    this.f6885c = sharedPreferences.getLong("timestamp", 0L);
                    string2.getClass();
                    this.f6884b = string2.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA") ? Tasks.forResult(string) : null;
                    m8630e(sharedPreferences);
                    return;
                }
                if (sharedPreferences.contains("statusCode")) {
                    Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                    this.f6885c = sharedPreferences.getLong("timestamp", 0L);
                    m8630e(sharedPreferences);
                    this.f6883a = Tasks.forException(zzaen.zza(status));
                    return;
                }
                return;
            }
            zzajb zzajbVar = (zzajb) AbstractC1949e.m8081c(sharedPreferences.getString("verifyAssertionRequest", ""), zzajb.CREATOR);
            String string3 = sharedPreferences.getString("operation", "");
            String string4 = sharedPreferences.getString("tenantId", null);
            String string5 = sharedPreferences.getString("firebaseUserUid", "");
            this.f6885c = sharedPreferences.getLong("timestamp", 0L);
            if (string4 != null) {
                firebaseAuth.m21993i(string4);
                zzajbVar.zzb(string4);
            }
            string3.getClass();
            switch (string3.hashCode()) {
                case -98509410:
                    if (!string3.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                        b7 = -1;
                    }
                    break;
                case 175006864:
                    b7 = !string3.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK") ? (byte) -1 : (byte) 1;
                    break;
                case 1450464913:
                    b7 = !string3.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    if (!firebaseAuth.m21989e().mo8711b0().equals(string5)) {
                        this.f6883a = null;
                    } else {
                        this.f6883a = firebaseAuth.m21984B(firebaseAuth.m21989e(), C4861j0.m22052a0(zzajbVar));
                    }
                    break;
                case 1:
                    if (!firebaseAuth.m21989e().mo8711b0().equals(string5)) {
                        this.f6883a = null;
                    } else {
                        this.f6883a = firebaseAuth.m21996n(firebaseAuth.m21989e(), C4861j0.m22052a0(zzajbVar));
                    }
                    break;
                case 2:
                    this.f6883a = firebaseAuth.m21994j(C4861j0.m22052a0(zzajbVar));
                    break;
                default:
                    this.f6883a = null;
                    break;
            }
            m8630e(sharedPreferences);
        }
    }
}
