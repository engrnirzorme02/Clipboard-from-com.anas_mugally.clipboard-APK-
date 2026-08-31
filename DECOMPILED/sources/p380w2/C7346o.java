package p380w2;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzfee;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: w2.o */
/* JADX INFO: loaded from: classes.dex */
final class C7346o extends WebViewClient {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC7350s f29229a;

    C7346o(BinderC7350s binderC7350s) {
        Objects.requireNonNull(binderC7350s);
        this.f29229a = binderC7350s;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        BinderC7350s binderC7350s = this.f29229a;
        if (binderC7350s.m32338R0() != null) {
            try {
                binderC7350s.m32338R0().zzd(zzfee.zzd(1, null, null));
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
        }
        BinderC7350s binderC7350s2 = this.f29229a;
        if (binderC7350s2.m32338R0() != null) {
            try {
                binderC7350s2.m32338R0().zzc(0);
            } catch (RemoteException e8) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33334i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        BinderC7350s binderC7350s = this.f29229a;
        if (str.startsWith(binderC7350s.m32335O0())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (binderC7350s.m32338R0() != null) {
                try {
                    binderC7350s.m32338R0().zzd(zzfee.zzd(3, null, null));
                } catch (RemoteException e7) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                }
            }
            BinderC7350s binderC7350s2 = this.f29229a;
            if (binderC7350s2.m32338R0() != null) {
                try {
                    binderC7350s2.m32338R0().zzc(3);
                } catch (RemoteException e8) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e8);
                }
            }
            this.f29229a.m32333M0(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            BinderC7350s binderC7350s3 = this.f29229a;
            if (binderC7350s3.m32338R0() != null) {
                try {
                    binderC7350s3.m32338R0().zzd(zzfee.zzd(1, null, null));
                } catch (RemoteException e9) {
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e9);
                }
            }
            BinderC7350s binderC7350s4 = this.f29229a;
            if (binderC7350s4.m32338R0() != null) {
                try {
                    binderC7350s4.m32338R0().zzc(0);
                } catch (RemoteException e10) {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e10);
                }
            }
            this.f29229a.m32333M0(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            BinderC7350s binderC7350s5 = this.f29229a;
            if (binderC7350s5.m32338R0() != null) {
                try {
                    binderC7350s5.m32338R0().zzf();
                } catch (RemoteException e11) {
                    int i11 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e11);
                }
            }
            BinderC7350s binderC7350s6 = this.f29229a;
            binderC7350s6.m32333M0(binderC7350s6.m32332L0(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        BinderC7350s binderC7350s7 = this.f29229a;
        if (binderC7350s7.m32338R0() != null) {
            try {
                binderC7350s7.m32338R0().zzh();
                binderC7350s7.m32338R0().zze();
            } catch (RemoteException e12) {
                int i12 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33334i("#007 Could not call remote method.", e12);
            }
        }
        this.f29229a.m32336P0(str);
        return true;
    }
}
