package com.anas_mugally.clipboard;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC2242c;
import com.anas_mugally.clipboard.p221ui.SearchActivity;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.notes.BrowserNotesFullActivity;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1617O;
import p238e6.InterfaceC5356a;
import p262h6.AbstractC5657c;
import p405z3.C7611b;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3034A {

    /* JADX INFO: renamed from: a */
    public static final C3034A f12453a = new C3034A();

    /* JADX INFO: renamed from: b */
    private static final int f12454b = 10;

    /* JADX INFO: renamed from: c */
    private static final String f12455c = "key_video_link";

    /* JADX INFO: renamed from: d */
    private static final String f12456d = "temporary_password";

    /* JADX INFO: renamed from: e */
    private static final String f12457e = "temporary_biometric_enabled";

    /* JADX INFO: renamed from: f */
    private static final String f12458f = "accessibilityService";

    /* JADX INFO: renamed from: g */
    private static final String f12459g = "primaryBubble";

    /* JADX INFO: renamed from: h */
    private static final String f12460h = "autoPick";

    /* JADX INFO: renamed from: i */
    private static final String f12461i = "clipboardOverlay";

    /* JADX INFO: renamed from: j */
    private static final String f12462j = "overlayPosition";

    /* JADX INFO: renamed from: k */
    private static final String f12463k = "overlayCustomPosition";

    /* JADX INFO: renamed from: l */
    private static final String f12464l = "typePick";

    /* JADX INFO: renamed from: m */
    private static final String f12465m = "keepDurationText";

    /* JADX INFO: renamed from: n */
    private static final String f12466n = "keepDuration";

    /* JADX INFO: renamed from: o */
    private static final String f12467o = "countOfNotesGet";

    /* JADX INFO: renamed from: p */
    private static final String f12468p = "autoSaveTemporaryText";

    /* JADX INFO: renamed from: q */
    private static final Set f12469q = AbstractC1617O.m6652f(Integer.valueOf(R.id.more), Integer.valueOf(R.id.copy), Integer.valueOf(R.id.translate), Integer.valueOf(R.id.save), Integer.valueOf(R.id.swap), Integer.valueOf(R.id.delete), Integer.valueOf(R.id.open_in_dialog), Integer.valueOf(R.id.add_note));

    /* JADX INFO: renamed from: r */
    private static final String[] f12470r = {"opLongPressedBACK", "opLongPressedHOME", "opLongPressedMENU"};

    /* JADX INFO: renamed from: s */
    private static final String[] f12471s = {"AddNewNote", "BrowseYourNotes", "BrowseYourTemporaryTexts", "AITextProcessing", "Show/HideTheMainAppBubble", "ExtractTextFromTheScreen", "ExtractTextFromTheScreenWhileScrolling"};

    private C3034A() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m15009K(InterfaceC5356a interfaceC5356a, DialogInterface dialogInterface, int i7) {
        interfaceC5356a.invoke();
    }

    /* JADX INFO: renamed from: M */
    private static final void m15010M(String str, Context context) {
        try {
            Intent intentAddFlags = new Intent("android.intent.action.VIEW").addFlags(268435456);
            AbstractC6118n.m27186d(intentAddFlags, "addFlags(...)");
            intentAddFlags.setData(Uri.parse("https://translate.google.com/?sl=auto&tl=en&text=" + Uri.encode(str)));
            context.startActivity(intentAddFlags);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m15012p(C3034A c3034a, Context context, String str, String str2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str2 = "com.android.systemui";
        }
        return c3034a.m15041o(context, str, str2);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m15013z(C3034A c3034a, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return c3034a.m15050y(z7);
    }

    /* JADX INFO: renamed from: A */
    public final String m15014A() {
        return f12459g;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m15015B(Activity activity) {
        AbstractC6118n.m27187e(activity, "<this>");
        return AbstractC5657c.f21645a.mo25169f(1, 21) % 20 == 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m15016C(Context context) {
        AbstractC6118n.m27187e(context, "<this>");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m15017D() {
        return f12464l;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m15018E(Context context) {
        AbstractC6118n.m27187e(context, "<this>");
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: F */
    public final void m15019F(Context context, String link) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(link, "link");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(link)).addFlags(402653184));
        } catch (Exception unused) {
            Toast.makeText(context, context.getString(R.string.error_open_app), 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m15020G(Context context, int i7) {
        AbstractC6118n.m27187e(context, "<this>");
        return (int) (i7 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: H */
    public final void m15021H(Activity activity, boolean z7) {
        AbstractC6118n.m27187e(activity, "<this>");
        SharedPreferences sharedPreferences = activity.getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("closeActivityAfterOp", z7);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: I */
    public final void m15022I(Activity activity, boolean z7) {
        AbstractC6118n.m27187e(activity, "<this>");
        SharedPreferences sharedPreferences = activity.getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("isBackAfterOp", z7);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: J */
    public final void m15023J(Activity activity, int i7, final InterfaceC5356a function) {
        AbstractC6118n.m27187e(activity, "<this>");
        AbstractC6118n.m27187e(function, "function");
        String string = i7 == 1 ? activity.getString(R.string.wrriring_delete_note) : activity.getString(R.string.wrriring_delete_mutable_notes, String.valueOf(i7));
        AbstractC6118n.m27184b(string);
        new C7611b(activity).m33365P(R.string.delete).mo9105i(string).m33361L(R.string.confirm, new DialogInterface.OnClickListener() { // from class: com.anas_mugally.clipboard.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C3034A.m15009K(function, dialogInterface, i8);
            }
        }).m33356G(R.string.cancel, null).m9118v();
    }

    /* JADX INFO: renamed from: L */
    public final void m15024L(Context context, String textContent) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(textContent, "textContent");
        try {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                if (AbstractC6118n.m27183a(resolveInfo.activityInfo.packageName, "com.google.android.apps.translate")) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str = activityInfo.name;
                    String str2 = activityInfo.packageName;
                    Intent intentAddFlags = new Intent().setPackage(str2).setClassName(str2, str).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT", textContent).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true).addFlags(268435456);
                    AbstractC6118n.m27186d(intentAddFlags, "addFlags(...)");
                    context.startActivity(intentAddFlags);
                    return;
                }
            }
            m15010M(textContent, context);
            Toast.makeText(context, R.string.download_google_translate, 0).show();
        } catch (Exception unused) {
            m15010M(textContent, context);
            Toast.makeText(context, R.string.download_google_translate, 0).show();
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m15025N(Activity activity, int i7) {
        AbstractC6118n.m27187e(activity, "<this>");
        if (((activity instanceof BrowserNotesFullActivity) || (activity instanceof AddNoteActivity) || (activity instanceof SearchActivity) || !m15040n(activity) || !f12469q.contains(Integer.valueOf(i7))) && !(activity instanceof TextDialogActivity)) {
            return false;
        }
        activity.finishAndRemoveTask();
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final void m15026O(AbstractActivityC2242c abstractActivityC2242c, int i7, boolean z7) {
        AbstractC6118n.m27187e(abstractActivityC2242c, "<this>");
        if (m15025N(abstractActivityC2242c, i7) || !z7) {
            return;
        }
        m15027P(abstractActivityC2242c, i7);
    }

    /* JADX INFO: renamed from: P */
    public final void m15027P(AbstractActivityC2242c abstractActivityC2242c, int i7) {
        AbstractC6118n.m27187e(abstractActivityC2242c, "<this>");
        if (!m15042q(abstractActivityC2242c) || i7 == R.id.select_all) {
            return;
        }
        abstractActivityC2242c.mo12238b().m23939s();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15028b(Context context) {
        AbstractC6118n.m27187e(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        AbstractC6118n.m27185c(applicationContext, "null cannot be cast to non-null type com.anas_mugally.clipboard.MyApplication");
        if (AbstractC3081u.m15315b((MyApplication) applicationContext) && MyAccessibilityService.f12639O.m15245a() != null) {
            return true;
        }
        Toast.makeText(context, R.string.enable_features, 0).show();
        Intent intent = new Intent(context, (Class<?>) AccessibilitySettingActivity.class);
        intent.addFlags(1350565888);
        context.startActivity(intent);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m15029c(Context context, String content) {
        AbstractC6118n.m27187e(context, "<this>");
        AbstractC6118n.m27187e(content, "content");
        if (AbstractC3041D.m15087l(content)) {
            Object systemService = context.getSystemService("clipboard");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(String.valueOf(System.currentTimeMillis()), content));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15030d(Context context) {
        AbstractC6118n.m27187e(context, "context");
        Toast.makeText(context, context.getString(R.string.please_enbale_show_over_app), 1).show();
        Intent intentAddFlags = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())).addFlags(268468224);
        AbstractC6118n.m27186d(intentAddFlags, "addFlags(...)");
        context.startActivity(intentAddFlags);
    }

    /* JADX INFO: renamed from: e */
    public final String m15031e() {
        return f12458f;
    }

    /* JADX INFO: renamed from: f */
    public final String m15032f() {
        return f12460h;
    }

    /* JADX INFO: renamed from: g */
    public final String m15033g() {
        return f12468p;
    }

    /* JADX INFO: renamed from: h */
    public final String[] m15034h() {
        return f12470r;
    }

    /* JADX INFO: renamed from: i */
    public final String[] m15035i() {
        return f12471s;
    }

    /* JADX INFO: renamed from: j */
    public final String m15036j() {
        return f12463k;
    }

    /* JADX INFO: renamed from: k */
    public final String m15037k() {
        return f12461i;
    }

    /* JADX INFO: renamed from: l */
    public final String m15038l() {
        return f12462j;
    }

    /* JADX INFO: renamed from: m */
    public final String m15039m() {
        return f12467o;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m15040n(Activity activity) {
        AbstractC6118n.m27187e(activity, "<this>");
        return activity.getSharedPreferences("SHARED_NAME", 0).getBoolean("closeActivityAfterOp", false);
    }

    /* JADX INFO: renamed from: o */
    public final String m15041o(Context context, String attrName, String p7) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(attrName, "attrName");
        AbstractC6118n.m27187e(p7, "p");
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(p7);
            return resourcesForApplication.getString(resourcesForApplication.getIdentifier(attrName, "string", p7));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15042q(Activity activity) {
        AbstractC6118n.m27187e(activity, "<this>");
        return activity.getSharedPreferences("SHARED_NAME", 0).getBoolean("isBackAfterOp", true);
    }

    /* JADX INFO: renamed from: r */
    public final String m15043r() {
        return f12466n;
    }

    /* JADX INFO: renamed from: s */
    public final String m15044s() {
        return f12465m;
    }

    /* JADX INFO: renamed from: t */
    public final String m15045t() {
        return f12457e;
    }

    /* JADX INFO: renamed from: u */
    public final String m15046u() {
        return f12456d;
    }

    /* JADX INFO: renamed from: v */
    public final String m15047v() {
        return f12455c;
    }

    /* JADX INFO: renamed from: w */
    public final int m15048w() {
        return f12454b;
    }

    /* JADX INFO: renamed from: x */
    public final int m15049x(Context context) {
        AbstractC6118n.m27187e(context, "<this>");
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public final int m15050y(boolean z7) {
        return (!z7 || MyAccessibilityService.f12639O.m15245a() == null) ? 2038 : 2032;
    }
}
