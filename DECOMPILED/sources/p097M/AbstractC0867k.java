package p097M;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import p104N.AbstractC0905b;

/* JADX INFO: renamed from: M.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0867k implements Spannable {

    /* JADX INFO: renamed from: M.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final TextPaint f3434a;

        /* JADX INFO: renamed from: b */
        private final TextDirectionHeuristic f3435b;

        /* JADX INFO: renamed from: c */
        private final int f3436c;

        /* JADX INFO: renamed from: d */
        private final int f3437d;

        /* JADX INFO: renamed from: e */
        final PrecomputedText.Params f3438e;

        /* JADX INFO: renamed from: M.k$a$a, reason: collision with other inner class name */
        public static class C7635a {

            /* JADX INFO: renamed from: a */
            private final TextPaint f3439a;

            /* JADX INFO: renamed from: c */
            private int f3441c = 1;

            /* JADX INFO: renamed from: d */
            private int f3442d = 1;

            /* JADX INFO: renamed from: b */
            private TextDirectionHeuristic f3440b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C7635a(TextPaint textPaint) {
                this.f3439a = textPaint;
            }

            /* JADX INFO: renamed from: a */
            public a m4005a() {
                return new a(this.f3439a, this.f3440b, this.f3441c, this.f3442d);
            }

            /* JADX INFO: renamed from: b */
            public C7635a m4006b(int i7) {
                this.f3441c = i7;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public C7635a m4007c(int i7) {
                this.f3442d = i7;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public C7635a m4008d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3440b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3438e = AbstractC0866j.m3999a(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3438e = null;
            }
            this.f3434a = textPaint;
            this.f3435b = textDirectionHeuristic;
            this.f3436c = i7;
            this.f3437d = i8;
        }

        /* JADX INFO: renamed from: a */
        public boolean m4000a(a aVar) {
            if (this.f3436c != aVar.m4001b() || this.f3437d != aVar.m4002c() || this.f3434a.getTextSize() != aVar.m4004e().getTextSize() || this.f3434a.getTextScaleX() != aVar.m4004e().getTextScaleX() || this.f3434a.getTextSkewX() != aVar.m4004e().getTextSkewX() || this.f3434a.getLetterSpacing() != aVar.m4004e().getLetterSpacing() || !TextUtils.equals(this.f3434a.getFontFeatureSettings(), aVar.m4004e().getFontFeatureSettings()) || this.f3434a.getFlags() != aVar.m4004e().getFlags() || !this.f3434a.getTextLocales().equals(aVar.m4004e().getTextLocales())) {
                return false;
            }
            if (this.f3434a.getTypeface() == null) {
                return aVar.m4004e().getTypeface() == null;
            }
            return this.f3434a.getTypeface().equals(aVar.m4004e().getTypeface());
        }

        /* JADX INFO: renamed from: b */
        public int m4001b() {
            return this.f3436c;
        }

        /* JADX INFO: renamed from: c */
        public int m4002c() {
            return this.f3437d;
        }

        /* JADX INFO: renamed from: d */
        public TextDirectionHeuristic m4003d() {
            return this.f3435b;
        }

        /* JADX INFO: renamed from: e */
        public TextPaint m4004e() {
            return this.f3434a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m4000a(aVar) && this.f3435b == aVar.m4003d();
        }

        public int hashCode() {
            return AbstractC0905b.m4126b(Float.valueOf(this.f3434a.getTextSize()), Float.valueOf(this.f3434a.getTextScaleX()), Float.valueOf(this.f3434a.getTextSkewX()), Float.valueOf(this.f3434a.getLetterSpacing()), Integer.valueOf(this.f3434a.getFlags()), this.f3434a.getTextLocales(), this.f3434a.getTypeface(), Boolean.valueOf(this.f3434a.isElegantTextHeight()), this.f3435b, Integer.valueOf(this.f3436c), Integer.valueOf(this.f3437d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f3434a.getTextSize());
            sb.append(", textScaleX=" + this.f3434a.getTextScaleX());
            sb.append(", textSkewX=" + this.f3434a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f3434a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f3434a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f3434a.getTextLocales());
            sb.append(", typeface=" + this.f3434a.getTypeface());
            sb.append(", variationSettings=" + this.f3434a.getFontVariationSettings());
            sb.append(", textDir=" + this.f3435b);
            sb.append(", breakStrategy=" + this.f3436c);
            sb.append(", hyphenationFrequency=" + this.f3437d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f3434a = params.getTextPaint();
            this.f3435b = params.getTextDirection();
            this.f3436c = params.getBreakStrategy();
            this.f3437d = params.getHyphenationFrequency();
            this.f3438e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
