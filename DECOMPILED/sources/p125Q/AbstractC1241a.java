package p125Q;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: Q.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1241a {

    /* JADX INFO: renamed from: a */
    private static final String[] f4451a = new String[0];

    /* JADX INFO: renamed from: Q.a$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static void m5473a(EditorInfo editorInfo, CharSequence charSequence, int i7) {
            editorInfo.setInitialSurroundingSubText(charSequence, i7);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5466a(CharSequence charSequence, int i7, int i8) {
        if (i8 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i7));
        }
        if (i8 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i7));
    }

    /* JADX INFO: renamed from: b */
    private static boolean m5467b(int i7) {
        int i8 = i7 & 4095;
        return i8 == 129 || i8 == 225 || i8 == 18;
    }

    /* JADX INFO: renamed from: c */
    public static void m5468c(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    /* JADX INFO: renamed from: d */
    public static void m5469d(EditorInfo editorInfo, CharSequence charSequence, int i7) {
        AbstractC0910g.m4139g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m5473a(editorInfo, charSequence, i7);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 - i7 : i8 - i7;
        int i11 = i8 > i9 ? i8 - i7 : i9 - i7;
        int length = charSequence.length();
        if (i7 < 0 || i10 < 0 || i11 > length) {
            m5471f(editorInfo, null, 0, 0);
            return;
        }
        if (m5467b(editorInfo.inputType)) {
            m5471f(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m5471f(editorInfo, charSequence, i10, i11);
        } else {
            m5472g(editorInfo, charSequence, i10, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5470e(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m5473a(editorInfo, charSequence, 0);
        } else {
            m5469d(editorInfo, charSequence, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m5471f(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }

    /* JADX INFO: renamed from: g */
    private static void m5472g(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        int i9 = i8 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int iMin = Math.min(charSequence.length() - i8, i11 - Math.min(i7, (int) (((double) i11) * 0.8d)));
        int iMin2 = Math.min(i7, i11 - iMin);
        int i12 = i7 - iMin2;
        if (m5466a(charSequence, i12, 0)) {
            i12++;
            iMin2--;
        }
        if (m5466a(charSequence, (i8 + iMin) - 1, 1)) {
            iMin--;
        }
        m5471f(editorInfo, i10 != i9 ? TextUtils.concat(charSequence.subSequence(i12, i12 + iMin2), charSequence.subSequence(i8, iMin + i8)) : charSequence.subSequence(i12, iMin2 + i10 + iMin + i12), iMin2, i10 + iMin2);
    }
}
