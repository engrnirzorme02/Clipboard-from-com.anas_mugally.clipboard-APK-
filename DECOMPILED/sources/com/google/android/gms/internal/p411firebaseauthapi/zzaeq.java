package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p164V3.C1762g;
import p191Z2.C2086a;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeq extends AsyncTask<Void, Void, zzaep> {
    private static final C2086a zza = new C2086a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaes> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final C1762g zzg;

    public zzaeq(String str, String str2, Intent intent, C1762g c1762g, zzaes zzaesVar) {
        this.zzb = AbstractC3718s.m18077f(str);
        this.zzg = (C1762g) AbstractC3718s.m18083l(c1762g);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(intent);
        String strM18077f = AbstractC3718s.m18077f(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder builderBuildUpon = Uri.parse(zzaesVar.zza(strM18077f)).buildUpon();
        builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", strM18077f).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) AbstractC3718s.m18083l(str2));
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaesVar);
        this.zze = zzaesVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzaep doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaes zzaesVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzaesVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzafe(zzaesVar.zza(), this.zzg, zzafc.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.m8615c(String.format("Error getting project config. Failed with %s %s", strZza, Integer.valueOf(responseCode)), new Object[0]);
                return zzaep.zzb(strZza);
            }
            zzahq zzahqVar = new zzahq();
            zzahqVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzahqVar.zza().contains(this.zzf) ? zzaep.zzb("UNAUTHORIZED_DOMAIN") : zzaep.zza(this.zzf);
            }
            for (String str : zzahqVar.zza()) {
                if (zza(str)) {
                    return zzaep.zza(str);
                }
            }
            return null;
        } catch (zzacn e7) {
            zza.m8615c("ConversionException encountered: " + e7.getMessage(), new Object[0]);
            return null;
        } catch (IOException e8) {
            zza.m8615c("IOException occurred: " + e8.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e9) {
            zza.m8615c("Null pointer encountered: " + e9.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzaep zzaepVar) {
        onPostExecute((zzaep) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzaex.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e7) {
            zza.m8620h("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e7), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaep zzaepVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzaes zzaesVar = this.zzd.get();
        if (zzaepVar != null) {
            strZza = zzaepVar.zza();
            strZzb = zzaepVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzaesVar == null) {
            zza.m8615c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzaesVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).m21983A());
        } else {
            zzaesVar.zza(this.zzb, AbstractC2137o.m8742a(strZzb));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            return host != null && (host.endsWith("firebaseapp.com") || host.endsWith("web.app"));
        } catch (URISyntaxException e7) {
            zza.m8615c("Error parsing URL for auth domain check: " + str + ". " + e7.getMessage(), new Object[0]);
        }
    }

    private static byte[] zza(InputStream inputStream, int i7) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i8 = inputStream.read(bArr);
                if (i8 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i8);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
