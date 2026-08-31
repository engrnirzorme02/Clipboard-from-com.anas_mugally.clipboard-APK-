package p170W2;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.AbstractActivityC2592j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC3580S;
import com.google.android.gms.common.api.internal.C3581T;
import com.google.android.gms.common.api.internal.InterfaceC3608k;
import com.google.android.gms.common.internal.AbstractC3661E;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC3664H;
import com.google.android.gms.common.util.AbstractC3754i;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import p017C.AbstractC0111l;
import p156U2.AbstractC1667a;
import p156U2.AbstractC1668b;
import p227d3.AbstractC5226b;

/* JADX INFO: renamed from: W2.e */
/* JADX INFO: loaded from: classes.dex */
public class C1840e extends C1841f {

    /* JADX INFO: renamed from: c */
    private String f5986c;

    /* JADX INFO: renamed from: e */
    private static final Object f5984e = new Object();

    /* JADX INFO: renamed from: f */
    private static final C1840e f5985f = new C1840e();

    /* JADX INFO: renamed from: d */
    public static final int f5983d = C1841f.f5987a;

    /* JADX INFO: renamed from: n */
    public static C1840e m7604n() {
        return f5985f;
    }

    @Override // p170W2.C1841f
    /* JADX INFO: renamed from: b */
    public Intent mo7605b(Context context, int i7, String str) {
        return super.mo7605b(context, i7, str);
    }

    @Override // p170W2.C1841f
    /* JADX INFO: renamed from: c */
    public PendingIntent mo7606c(Context context, int i7, int i8) {
        return super.mo7606c(context, i7, i8);
    }

    @Override // p170W2.C1841f
    /* JADX INFO: renamed from: e */
    public final String mo7607e(int i7) {
        return super.mo7607e(i7);
    }

    @Override // p170W2.C1841f
    /* JADX INFO: renamed from: g */
    public int mo7608g(Context context) {
        return super.mo7608g(context);
    }

    @Override // p170W2.C1841f
    /* JADX INFO: renamed from: h */
    public int mo7609h(Context context, int i7) {
        return super.mo7609h(context, i7);
    }

    @Override // p170W2.C1841f
    /* JADX INFO: renamed from: j */
    public final boolean mo7610j(int i7) {
        return super.mo7610j(i7);
    }

    /* JADX INFO: renamed from: l */
    public Dialog m7611l(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return m7615q(activity, i7, AbstractDialogInterfaceOnClickListenerC3664H.m17983b(activity, mo7605b(activity, i7, "d"), i8), onCancelListener, null);
    }

    /* JADX INFO: renamed from: m */
    public PendingIntent m7612m(Context context, C1837b c1837b) {
        return c1837b.m7599W() ? c1837b.m7598V() : mo7606c(context, c1837b.m7596T(), 0);
    }

    /* JADX INFO: renamed from: o */
    public boolean m7613o(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM7611l = m7611l(activity, i7, i8, onCancelListener);
        if (dialogM7611l == null) {
            return false;
        }
        m7618t(activity, dialogM7611l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m7614p(Context context, int i7) {
        m7619u(context, i7, null, m7625d(context, i7, 0, "n"));
    }

    /* JADX INFO: renamed from: q */
    final Dialog m7615q(Context context, int i7, AbstractDialogInterfaceOnClickListenerC3664H abstractDialogInterfaceOnClickListenerC3664H, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(AbstractC3661E.m17976c(context, i7));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strM17975b = AbstractC3661E.m17975b(context, i7);
        DialogInterface.OnClickListener onClickListener2 = abstractDialogInterfaceOnClickListenerC3664H;
        if (strM17975b != null) {
            if (abstractDialogInterfaceOnClickListenerC3664H == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strM17975b, onClickListener2);
        }
        String strM17979f = AbstractC3661E.m17979f(context, i7);
        if (strM17979f != null) {
            builder2.setTitle(strM17979f);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder2.create();
    }

    /* JADX INFO: renamed from: r */
    public final Dialog m7616r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC3661E.m17976c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        m7618t(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    /* JADX INFO: renamed from: s */
    public final C3581T m7617s(Context context, AbstractC3580S abstractC3580S) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C3581T c3581t = new C3581T(abstractC3580S);
        zao.zaa(context, c3581t, intentFilter);
        c3581t.m17848a(context);
        if (m7626i(context, "com.google.android.gms")) {
            return c3581t;
        }
        abstractC3580S.mo17847a();
        c3581t.m17849b();
        return null;
    }

    /* JADX INFO: renamed from: t */
    final void m7618t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2592j) {
                C1848m.m7647h2(dialog, onCancelListener).mo7649g2(((AbstractActivityC2592j) activity).m12232H0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1838c.m7601a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* JADX INFO: renamed from: u */
    final void m7619u(Context context, int i7, String str, PendingIntent pendingIntent) {
        int i8;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            m7620v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM17978e = AbstractC3661E.m17978e(context, i7);
        String strM17977d = AbstractC3661E.m17977d(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC3718s.m18083l(context.getSystemService("notification"));
        AbstractC0111l.e eVarM484y = new AbstractC0111l.e(context).m477r(true).m465e(true).m470j(strM17978e).m484y(new AbstractC0111l.c().m455h(strM17977d));
        if (AbstractC3754i.m18177f(context)) {
            AbstractC3718s.m18086o(AbstractC3760o.m18195c());
            eVarM484y.m482w(context.getApplicationInfo().icon).m480u(2);
            if (AbstractC3754i.m18178g(context)) {
                eVarM484y.m462a(AbstractC1667a.f5554a, resources.getString(AbstractC1668b.f5569o), pendingIntent);
            } else {
                eVarM484y.m468h(pendingIntent);
            }
        } else {
            eVarM484y.m482w(R.drawable.stat_sys_warning).m485z(resources.getString(AbstractC1668b.f5562h)).m461C(System.currentTimeMillis()).m468h(pendingIntent).m469i(strM17977d);
        }
        if (AbstractC3760o.m18199g()) {
            AbstractC3718s.m18086o(AbstractC3760o.m18199g());
            synchronized (f5984e) {
                str2 = this.f5986c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(AbstractC1668b.f5561g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarM484y.m466f(str2);
        }
        Notification notificationM463b = eVarM484y.m463b();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            AbstractC1845j.f5993b.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, notificationM463b);
    }

    /* JADX INFO: renamed from: v */
    final void m7620v(Context context) {
        new HandlerC1850o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7621w(Activity activity, InterfaceC3608k interfaceC3608k, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM7615q = m7615q(activity, i7, AbstractDialogInterfaceOnClickListenerC3664H.m17984c(interfaceC3608k, mo7605b(activity, i7, "d"), 2), onCancelListener, null);
        if (dialogM7615q == null) {
            return false;
        }
        m7618t(activity, dialogM7615q, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7622x(Context context, C1837b c1837b, int i7) {
        PendingIntent pendingIntentM7612m;
        if (AbstractC5226b.m24146a(context) || (pendingIntentM7612m = m7612m(context, c1837b)) == null) {
            return false;
        }
        m7619u(context, c1837b.m7596T(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m17740a(context, pendingIntentM7612m, i7, true), zap.zaa | 134217728));
        return true;
    }
}
