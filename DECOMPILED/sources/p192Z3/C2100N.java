package p192Z3;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzac;
import com.google.android.gms.internal.p411firebaseauthapi.zzahs;
import com.google.android.gms.internal.p411firebaseauthapi.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Z3.N */
/* JADX INFO: loaded from: classes.dex */
final class C2100N implements Continuation {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ String f6897a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ C2101O f6898b;

    C2100N(C2101O c2101o, String str) {
        this.f6897a = str;
        Objects.requireNonNull(c2101o);
        this.f6898b = c2101o;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new C2098L((String) AbstractC3718s.m18083l(((Exception) AbstractC3718s.m18083l(task.getException())).getMessage())));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        String strZza = zzahsVar.zza();
        if (zzac.zzc(strZza)) {
            return Tasks.forException(new C2098L("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f6897a));
        }
        List<String> listZza = zzt.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f6897a);
        }
        C2101O c2101o = this.f6898b;
        Task taskMo8638a = c2101o.f6904f.mo8638a((Application) c2101o.f6902d.m7405l(), str);
        C2101O.m8639c(this.f6898b, zzahsVar, taskMo8638a, this.f6897a);
        return taskMo8638a;
    }
}
