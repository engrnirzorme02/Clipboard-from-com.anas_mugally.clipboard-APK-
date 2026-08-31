package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: androidx.emoji2.text.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2569q extends AbstractC2562j {

    /* JADX INFO: renamed from: g */
    private static Paint f9903g;

    /* JADX INFO: renamed from: f */
    private TextPaint f9904f;

    public C2569q(C2568p c2568p) {
        super(c2568p);
    }

    /* JADX INFO: renamed from: c */
    private TextPaint m11859c(CharSequence charSequence, int i7, int i8, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i7, i8, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f9904f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f9904f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static Paint m11860e() {
        if (f9903g == null) {
            TextPaint textPaint = new TextPaint();
            f9903g = textPaint;
            textPaint.setColor(C2558f.m11751c().m11758d());
            f9903g.setStyle(Paint.Style.FILL);
        }
        return f9903g;
    }

    /* JADX INFO: renamed from: d */
    void m11861d(Canvas canvas, TextPaint textPaint, float f7, float f8, float f9, float f10) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f7, f9, f8, f10, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        TextPaint textPaintM11859c = m11859c(charSequence, i7, i8, paint);
        if (textPaintM11859c != null && textPaintM11859c.bgColor != 0) {
            m11861d(canvas, textPaintM11859c, f7, f7 + m11805b(), i9, i11);
        }
        Paint paint2 = textPaintM11859c;
        if (C2558f.m11751c().m11760j()) {
            canvas.drawRect(f7, i9, f7 + m11805b(), i11, m11860e());
        }
        C2568p c2568pM11804a = m11804a();
        float f8 = i10;
        if (paint2 == null) {
            paint2 = paint;
        }
        c2568pM11804a.m11847a(canvas, f7, f8, paint2);
    }
}
