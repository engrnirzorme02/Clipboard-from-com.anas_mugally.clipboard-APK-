package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p097M.AbstractC0867k;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.core.widget.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2458i {

    /* JADX INFO: renamed from: androidx.core.widget.i$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m10766a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* JADX INFO: renamed from: b */
        static int m10767b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* JADX INFO: renamed from: c */
        static void m10768c(TextView textView, int i7) {
            textView.setBreakStrategy(i7);
        }

        /* JADX INFO: renamed from: d */
        static void m10769d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* JADX INFO: renamed from: e */
        static void m10770e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* JADX INFO: renamed from: f */
        static void m10771f(TextView textView, int i7) {
            textView.setHyphenationFrequency(i7);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static DecimalFormatSymbols m10772a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static String[] m10773a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* JADX INFO: renamed from: b */
        static PrecomputedText.Params m10774b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* JADX INFO: renamed from: c */
        static void m10775c(TextView textView, int i7) {
            textView.setFirstBaselineToTopHeight(i7);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$d */
    static class d {
        /* JADX INFO: renamed from: a */
        public static void m10776a(TextView textView, int i7, float f7) {
            textView.setLineHeight(i7, f7);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$e */
    private static class e implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        private final ActionMode.Callback f9373a;

        /* JADX INFO: renamed from: b */
        private final TextView f9374b;

        /* JADX INFO: renamed from: c */
        private Class f9375c;

        /* JADX INFO: renamed from: d */
        private Method f9376d;

        /* JADX INFO: renamed from: e */
        private boolean f9377e;

        /* JADX INFO: renamed from: f */
        private boolean f9378f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f9373a = callback;
            this.f9374b = textView;
        }

        /* JADX INFO: renamed from: a */
        private Intent m10777a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* JADX INFO: renamed from: b */
        private Intent m10778b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m10777a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m10780e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* JADX INFO: renamed from: c */
        private List m10779c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m10777a(), 0)) {
                    if (m10781f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        private boolean m10780e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* JADX INFO: renamed from: f */
        private boolean m10781f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* JADX INFO: renamed from: g */
        private void m10782g(Menu menu) {
            Context context = this.f9374b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z7 = this.f9378f;
            Class cls = Integer.TYPE;
            if (!z7) {
                this.f9378f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f9375c = cls2;
                    this.f9376d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f9377e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f9375c = null;
                    this.f9376d = null;
                    this.f9377e = false;
                }
            }
            try {
                Method declaredMethod = (this.f9377e && this.f9375c.isInstance(menu)) ? this.f9376d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listM10779c = m10779c(context, packageManager);
                for (int i7 = 0; i7 < listM10779c.size(); i7++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listM10779c.get(i7);
                    menu.add(0, 0, i7 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m10778b(resolveInfo, this.f9374b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* JADX INFO: renamed from: d */
        ActionMode.Callback m10783d() {
            return this.f9373a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9373a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9373a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f9373a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m10782g(menu);
            return this.f9373a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10750a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: b */
    public static int m10751b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: renamed from: c */
    private static int m10752c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    /* JADX INFO: renamed from: d */
    private static TextDirectionHeuristic m10753d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.m10773a(b.m10772a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z7 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z7 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0867k.a m10754e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new AbstractC0867k.a(c.m10774b(textView));
        }
        AbstractC0867k.a.C7635a c7635a = new AbstractC0867k.a.C7635a(new TextPaint(textView.getPaint()));
        c7635a.m4006b(a.m10766a(textView));
        c7635a.m4007c(a.m10767b(textView));
        c7635a.m4008d(m10753d(textView));
        return c7635a.m4005a();
    }

    /* JADX INFO: renamed from: f */
    public static void m10755f(TextView textView, ColorStateList colorStateList) {
        AbstractC0910g.m4139g(textView);
        a.m10769d(textView, colorStateList);
    }

    /* JADX INFO: renamed from: g */
    public static void m10756g(TextView textView, PorterDuff.Mode mode) {
        AbstractC0910g.m4139g(textView);
        a.m10770e(textView, mode);
    }

    /* JADX INFO: renamed from: h */
    public static void m10757h(TextView textView, int i7) {
        AbstractC0910g.m4136d(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            c.m10775c(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m10758i(TextView textView, int i7) {
        AbstractC0910g.m4136d(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m10759j(TextView textView, int i7) {
        AbstractC0910g.m4136d(i7);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i7 != fontMetricsInt) {
            textView.setLineSpacing(i7 - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m10760k(TextView textView, int i7, float f7) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m10776a(textView, i7, f7);
        } else {
            m10759j(textView, Math.round(TypedValue.applyDimension(i7, f7, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m10761l(TextView textView, AbstractC0867k abstractC0867k) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m10754e(textView);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public static void m10762m(TextView textView, int i7) {
        textView.setTextAppearance(i7);
    }

    /* JADX INFO: renamed from: n */
    public static void m10763n(TextView textView, AbstractC0867k.a aVar) {
        textView.setTextDirection(m10752c(aVar.m4003d()));
        textView.getPaint().set(aVar.m4004e());
        a.m10768c(textView, aVar.m4001b());
        a.m10771f(textView, aVar.m4002c());
    }

    /* JADX INFO: renamed from: o */
    public static ActionMode.Callback m10764o(ActionMode.Callback callback) {
        return callback instanceof e ? ((e) callback).m10783d() : callback;
    }

    /* JADX INFO: renamed from: p */
    public static ActionMode.Callback m10765p(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof e) || callback == null) ? callback : new e(callback, textView);
    }
}
