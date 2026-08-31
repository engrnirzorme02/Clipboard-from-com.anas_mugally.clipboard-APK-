package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbsw;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private zzbsw f13863a;

    /* JADX INFO: renamed from: a */
    private final void m17166a() {
        zzbsw zzbswVar = this.f13863a;
        if (zzbswVar != null) {
            try {
                zzbswVar.zzs();
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzm(i7, i8, intent);
            }
        } catch (Exception e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null && !zzbswVar.zzg()) {
                return;
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        super.onBackPressed();
        try {
            zzbsw zzbswVar2 = this.f13863a;
            if (zzbswVar2 != null) {
                zzbswVar2.zze();
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzn(BinderC3773b.m18221N0(configuration));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC7599p.m33326a("AdActivity onCreate");
        zzbsw zzbswVarM17351g = C3244B.m17191b().m17351g(this);
        this.f13863a = zzbswVarM17351g;
        if (zzbswVarM17351g == null) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbswVarM17351g.zzh(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        AbstractC7599p.m33326a("AdActivity onDestroy");
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzq();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        AbstractC7599p.m33326a("AdActivity onPause");
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzl();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzH(i7, strArr, iArr);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        AbstractC7599p.m33326a("AdActivity onRestart");
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzi();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        AbstractC7599p.m33326a("AdActivity onResume");
        super.onResume();
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzk();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzo(bundle);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        AbstractC7599p.m33326a("AdActivity onStart");
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzj();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        AbstractC7599p.m33326a("AdActivity onStop");
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzp();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsw zzbswVar = this.f13863a;
            if (zzbswVar != null) {
                zzbswVar.zzf();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        super.setContentView(i7);
        m17166a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        m17166a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m17166a();
    }
}
