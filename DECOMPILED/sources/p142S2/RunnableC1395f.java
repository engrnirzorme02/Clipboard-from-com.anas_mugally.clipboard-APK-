package p142S2;

import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.AbstractC3640j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3630v;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p409authapi.zbbb;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p191Z2.C2086a;

/* JADX INFO: renamed from: S2.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1395f implements Runnable {

    /* JADX INFO: renamed from: c */
    private static final C2086a f4901c = new C2086a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a */
    private final String f4902a;

    /* JADX INFO: renamed from: b */
    private final C3630v f4903b = new C3630v(null);

    public RunnableC1395f(String str) {
        this.f4902a = AbstractC3718s.m18077f(str);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC3561i m5982a(String str) {
        if (str == null) {
            return AbstractC3640j.m17969a(new Status(4), null);
        }
        RunnableC1395f runnableC1395f = new RunnableC1395f(str);
        new Thread(runnableC1395f).start();
        return runnableC1395f.f4903b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f14515s;
        try {
            String str = this.f4902a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            URL url = new URL(sb.toString());
            int i7 = zbbb.zbb;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f14513f;
            } else {
                f4901c.m8615c("Unable to revoke access!", new Object[0]);
            }
            C2086a c2086a = f4901c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            c2086a.m8613a(sb2.toString(), new Object[0]);
        } catch (IOException e7) {
            f4901c.m8615c("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            f4901c.m8615c("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f4903b.setResult(status);
    }
}
