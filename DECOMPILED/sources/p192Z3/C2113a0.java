package p192Z3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Iterator;

/* JADX INFO: renamed from: Z3.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2113a0 {

    /* JADX INFO: renamed from: a */
    private static C2113a0 f6921a = new C2113a0();

    private C2113a0() {
    }

    /* JADX INFO: renamed from: a */
    public static C2113a0 m8676a() {
        return f6921a;
    }

    /* JADX INFO: renamed from: c */
    private static SharedPreferences m8677c(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    /* JADX INFO: renamed from: f */
    private static void m8678f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C2117c0 m8679b(Context context, String str, String str2) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        SharedPreferences sharedPreferencesM8677c = m8677c(context, str);
        String str3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String str4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String str5 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String str6 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = sharedPreferencesM8677c.getString(str3, null);
        String string2 = sharedPreferencesM8677c.getString(str4, null);
        String string3 = sharedPreferencesM8677c.getString(str5, null);
        String string4 = sharedPreferencesM8677c.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = sharedPreferencesM8677c.getString(str6, null);
        SharedPreferences.Editor editorEdit = sharedPreferencesM8677c.edit();
        editorEdit.remove(str3);
        editorEdit.remove(str4);
        editorEdit.remove(str5);
        editorEdit.remove(str6);
        editorEdit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new C2117c0(string, string2, string3, string4, string5);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8680d(Context context, String str, String str2, String str3, String str4) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        SharedPreferences sharedPreferencesM8677c = m8677c(context, str);
        m8678f(sharedPreferencesM8677c);
        SharedPreferences.Editor editorEdit = sharedPreferencesM8677c.edit();
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str3);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m8681e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str3);
        AbstractC3718s.m18077f(str7);
        SharedPreferences sharedPreferencesM8677c = m8677c(context, str);
        m8678f(sharedPreferencesM8677c);
        SharedPreferences.Editor editorEdit = sharedPreferencesM8677c.edit();
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized String m8682g(Context context, String str, String str2) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        SharedPreferences sharedPreferencesM8677c = m8677c(context, str);
        String str3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String string = sharedPreferencesM8677c.getString(str3, null);
        String str4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string2 = sharedPreferencesM8677c.getString(str4, null);
        SharedPreferences.Editor editorEdit = sharedPreferencesM8677c.edit();
        editorEdit.remove(str3);
        editorEdit.remove(str4);
        editorEdit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
