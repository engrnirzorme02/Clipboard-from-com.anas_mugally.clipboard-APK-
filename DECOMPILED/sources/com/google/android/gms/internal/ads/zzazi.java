package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazi extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzayz zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazi() {
        zzayz zzayzVar = new zzayz();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzayzVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbdz.zzd.zze()).intValue();
        this.zzg = ((Long) zzbdz.zza.zze()).intValue();
        this.zzh = ((Long) zzbdz.zze.zze()).intValue();
        this.zzi = ((Long) zzbdz.zzc.zze()).intValue();
        this.zzj = ((Integer) C3250D.m17200c().zzd(zzbci.zzal)).intValue();
        this.zzk = ((Integer) C3250D.m17200c().zzd(zzbci.zzam)).intValue();
        this.zzl = ((Integer) C3250D.m17200c().zzd(zzbci.zzan)).intValue();
        this.zze = ((Long) zzbdz.zzf.zze()).intValue();
        this.zzm = (String) C3250D.m17200c().zzd(zzbci.zzap);
        this.zzn = ((Boolean) C3250D.m17200c().zzd(zzbci.zzaq)).booleanValue();
        this.zzo = ((Boolean) C3250D.m17200c().zzd(zzbci.zzar)).booleanValue();
        ((Boolean) C3250D.m17200c().zzd(zzbci.zzas)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                Context contextZze = C7351t.m32353k().zze();
                try {
                    if (contextZze != null) {
                        ActivityManager activityManager = (ActivityManager) contextZze.getSystemService("activity");
                        KeyguardManager keyguardManager = (KeyguardManager) contextZze.getSystemService("keyguard");
                        if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (Process.myPid() == next.pid) {
                                        if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) contextZze.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                            Activity activityZzd = C7351t.m32353k().zzd();
                                            if (activityZzd == null) {
                                                int i7 = AbstractC3490o0.f14278b;
                                                AbstractC7599p.m33326a("ContentFetchThread: no activity. Sleeping.");
                                                zze();
                                            } else {
                                                View viewFindViewById = null;
                                                try {
                                                    if (activityZzd.getWindow() != null && activityZzd.getWindow().getDecorView() != null) {
                                                        viewFindViewById = activityZzd.getWindow().getDecorView().findViewById(R.id.content);
                                                    }
                                                } catch (Exception e7) {
                                                    C7351t.m32354l().zzg(e7, "ContentFetchTask.extractContent");
                                                    int i8 = AbstractC3490o0.f14278b;
                                                    AbstractC7599p.m33326a("Failed getting root view of activity. Content not extracted.");
                                                }
                                                if (viewFindViewById != null) {
                                                    viewFindViewById.post(new zzaze(this, viewFindViewById));
                                                }
                                            }
                                        }
                                        Thread.sleep(this.zze * zzbbn.zzq.zzf);
                                    }
                                }
                            }
                        }
                        obj = this.zzc;
                        synchronized (obj) {
                            while (this.zzb) {
                                try {
                                    int i9 = AbstractC3490o0.f14278b;
                                    AbstractC7599p.m33326a("ContentFetchTask: waiting");
                                    obj.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("ContentFetchTask: sleeping");
                    zze();
                    Thread.sleep(this.zze * zzbbn.zzq.zzf);
                } catch (InterruptedException e8) {
                    int i11 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Error in ContentFetchTask", e8);
                } catch (Exception e9) {
                    int i12 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Error in ContentFetchTask", e9);
                    C7351t.m32354l().zzg(e9, "ContentFetchTask.run");
                }
            } catch (Throwable th) {
                C7351t.m32354l().zzg(th, "ContentFetchTask.isInForeground");
            }
            obj = this.zzc;
            synchronized (obj) {
                while (this.zzb) {
                    int i13 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("ContentFetchTask: waiting");
                    obj.wait();
                }
            }
        }
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void zzb(View view) {
        try {
            zzayy zzayyVar = new zzayy(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = C7351t.m32353k().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) C3250D.m17200c().zzd(zzbci.zzao), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzazh zzazhVarZzc = zzc(view, zzayyVar);
            zzayyVar.zzi();
            if (zzazhVarZzc.zza == 0 && zzazhVarZzc.zzb == 0) {
                return;
            }
            int i7 = zzazhVarZzc.zzb;
            if (i7 != 0) {
                if (i7 == 0) {
                }
                this.zzd.zzc(zzayyVar);
            } else if (zzayyVar.zzl() == 0) {
                return;
            }
            if (this.zzd.zza(zzayyVar)) {
                return;
            }
            this.zzd.zzc(zzayyVar);
        } catch (Exception e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Exception in fetchContentOnUIThread", e7);
            C7351t.m32354l().zzg(e7, "ContentFetchTask.fetchContent");
        }
    }

    final zzazh zzc(View view, zzayy zzayyVar) {
        if (view == null) {
            return new zzazh(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzazh(this, 0, 0);
            }
            zzayyVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzazh(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcek)) {
            WebView webView = (WebView) view;
            if (!AbstractC3760o.m18194b()) {
                return new zzazh(this, 0, 0);
            }
            zzayyVar.zze();
            webView.post(new zzazg(this, zzayyVar, webView, globalVisibleRect));
            return new zzazh(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzazh(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            zzazh zzazhVarZzc = zzc(viewGroup.getChildAt(i9), zzayyVar);
            i7 += zzazhVarZzc.zza;
            i8 += zzazhVarZzc.zzb;
        }
        return new zzazh(this, i7, i8);
    }

    final void zzd(zzayy zzayyVar, WebView webView, String str, boolean z7) {
        zzayy zzayyVar2;
        zzayyVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzayyVar2 = zzayyVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzayyVar2 = zzayyVar;
                    zzayyVar2.zzf(strOptString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzayyVar.zzf(sb.toString(), z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzayyVar2 = zzayyVar;
                }
            }
            if (zzayyVar2.zza()) {
                this.zzd.zzb(zzayyVar2);
            }
        } catch (JSONException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Json string may be malformed.");
        } catch (Throwable th) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Failed to get webview content.", th);
            C7351t.m32354l().zzg(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = ");
            sb.append(true);
            String string = sb.toString();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a(string);
        }
    }
}
