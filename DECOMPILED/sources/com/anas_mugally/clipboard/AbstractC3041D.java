package com.anas_mugally.clipboard;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC2242c;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.AbstractC6118n;
import p000.C5446g;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p220c6.AbstractC3026b;
import p238e6.InterfaceC5356a;
import p302m6.C6402d;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3041D {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1429g f12493a = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.B
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Integer.valueOf(AbstractC3041D.m15078c());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final int m15078c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final String m15079d(AbstractActivityC2242c abstractActivityC2242c, Uri uri) {
        AbstractC6118n.m27187e(abstractActivityC2242c, "<this>");
        AbstractC6118n.m27187e(uri, "uri");
        try {
            InputStream inputStreamOpenInputStream = abstractActivityC2242c.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                byte[] bArr = new byte[3];
                inputStreamOpenInputStream.read(bArr);
                String strName = (bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? StandardCharsets.UTF_8.name() : null;
                AbstractC3026b.m14999a(inputStreamOpenInputStream, null);
                return strName;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e7) {
            Log.w(abstractActivityC2242c.getClass().getName(), "Could not detect encoding", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m15080e(Context context) {
        AbstractC6118n.m27187e(context, "<this>");
        return !Settings.canDrawOverlays(context);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m15081f(Context context, String text) {
        AbstractC6118n.m27187e(context, "<this>");
        AbstractC6118n.m27187e(text, "text");
        if (m15087l(text)) {
            return true;
        }
        Toast.makeText(context, R.string.text_very_larg, 0).show();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final String m15082g(Activity activity) {
        AbstractC6118n.m27187e(activity, "<this>");
        int iM15086k = m15086k();
        if (iM15086k == 1) {
            return "https://galaxystore.samsung.com/detail/" + activity.getPackageName();
        }
        if (iM15086k != 2) {
            return "https://play.google.com/store/apps/details?id=" + activity.getPackageName();
        }
        return "https://galaxystore.samsung.com/detail/" + activity.getPackageName();
    }

    /* JADX INFO: renamed from: h */
    public static final String m15083h(Activity activity) {
        AbstractC6118n.m27187e(activity, "<this>");
        int iM15086k = m15086k();
        if (iM15086k == 1) {
            return "https://galaxystore.samsung.com/detail/" + activity.getPackageName();
        }
        if (iM15086k != 2) {
            return "https://play.google.com/store/apps/developer?id=Anas+Mugally";
        }
        return "https://galaxystore.samsung.com/detail/" + activity.getPackageName();
    }

    /* JADX INFO: renamed from: i */
    public static final long m15084i(AbstractActivityC2242c abstractActivityC2242c, Uri uri) {
        AbstractC6118n.m27187e(abstractActivityC2242c, "<this>");
        AbstractC6118n.m27187e(uri, "uri");
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = abstractActivityC2242c.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return 0L;
            }
            try {
                long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                AbstractC3026b.m14999a(parcelFileDescriptorOpenFileDescriptor, null);
                return statSize;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(parcelFileDescriptorOpenFileDescriptor, th);
                    throw th2;
                }
            }
        } catch (Exception e7) {
            Log.w(abstractActivityC2242c.getClass().getName(), "Could not get file size", e7);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m15085j() {
        int iM15086k = m15086k();
        if (iM15086k != 1) {
            return iM15086k != 2 ? "GOOGLE" : "HUAWEI";
        }
        return "SAMSUNG";
    }

    /* JADX INFO: renamed from: k */
    public static final int m15086k() {
        return ((Number) f12493a.getValue()).intValue();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m15087l(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        return m15092q(str) <= 512000;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m15088m(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        return m15092q(str) <= 102400;
    }

    /* JADX INFO: renamed from: n */
    public static final void m15089n(final AbstractActivityC3130a abstractActivityC3130a, final String text, final ComponentName componentName, final ActionsLayout.EnumC3037c type, final boolean z7) {
        AbstractC6118n.m27187e(abstractActivityC3130a, "<this>");
        AbstractC6118n.m27187e(text, "text");
        AbstractC6118n.m27187e(type, "type");
        if (m15081f(abstractActivityC3130a, text)) {
            abstractActivityC3130a.m16261j3(new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.C
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return AbstractC3041D.m15091p(abstractActivityC3130a, text, componentName, type, z7);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m15090o(AbstractActivityC3130a abstractActivityC3130a, String str, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            enumC3037c = ActionsLayout.EnumC3037c.POPUP;
        }
        if ((i7 & 8) != 0) {
            z7 = false;
        }
        m15089n(abstractActivityC3130a, str, componentName, enumC3037c, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C1444v m15091p(AbstractActivityC3130a abstractActivityC3130a, String str, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, boolean z7) {
        C5446g.f20735a.m24651e(abstractActivityC3130a, str, componentName, enumC3037c, 1350565888);
        C3034A.f12453a.m15026O(abstractActivityC3130a, R.id.save, z7);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: q */
    public static final int m15092q(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        byte[] bytes = str.getBytes(C6402d.f24428b);
        AbstractC6118n.m27186d(bytes, "getBytes(...)");
        return bytes.length;
    }
}
