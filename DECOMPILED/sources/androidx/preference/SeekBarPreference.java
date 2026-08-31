package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: O */
    int f10602O;

    /* JADX INFO: renamed from: P */
    int f10603P;

    /* JADX INFO: renamed from: Q */
    private int f10604Q;

    /* JADX INFO: renamed from: R */
    private int f10605R;

    /* JADX INFO: renamed from: S */
    boolean f10606S;

    /* JADX INFO: renamed from: T */
    SeekBar f10607T;

    /* JADX INFO: renamed from: U */
    private TextView f10608U;

    /* JADX INFO: renamed from: V */
    boolean f10609V;

    /* JADX INFO: renamed from: W */
    private boolean f10610W;

    /* JADX INFO: renamed from: X */
    boolean f10611X;

    /* JADX INFO: renamed from: Y */
    private final SeekBar.OnSeekBarChangeListener f10612Y;

    /* JADX INFO: renamed from: Z */
    private final View.OnKeyListener f10613Z;

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$a */
    class C2674a implements SeekBar.OnSeekBarChangeListener {
        C2674a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i7, boolean z7) {
            if (z7) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f10611X || !seekBarPreference.f10606S) {
                    seekBarPreference.m12760a0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.m12761b0(i7 + seekBarPreference2.f10603P);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f10606S = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f10606S = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f10603P != seekBarPreference.f10602O) {
                seekBarPreference.m12760a0(seekBar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$b */
    class ViewOnKeyListenerC2675b implements View.OnKeyListener {
        ViewOnKeyListenerC2675b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f10609V && (i7 == 21 || i7 == 22)) || i7 == 23 || i7 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f10607T;
            if (seekBar != null) {
                return seekBar.onKeyDown(i7, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10612Y = new C2674a();
        this.f10613Z = new ViewOnKeyListenerC2675b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27518C0, i7, i8);
        this.f10603P = typedArrayObtainStyledAttributes.getInt(AbstractC6877g.f27524F0, 0);
        m12758X(typedArrayObtainStyledAttributes.getInt(AbstractC6877g.f27520D0, 100));
        m12759Y(typedArrayObtainStyledAttributes.getInt(AbstractC6877g.f27526G0, 0));
        this.f10609V = typedArrayObtainStyledAttributes.getBoolean(AbstractC6877g.f27522E0, true);
        this.f10610W = typedArrayObtainStyledAttributes.getBoolean(AbstractC6877g.f27528H0, false);
        this.f10611X = typedArrayObtainStyledAttributes.getBoolean(AbstractC6877g.f27530I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: Z */
    private void m12757Z(int i7, boolean z7) {
        int i8 = this.f10603P;
        if (i7 < i8) {
            i7 = i8;
        }
        int i9 = this.f10604Q;
        if (i7 > i9) {
            i7 = i9;
        }
        if (i7 != this.f10602O) {
            this.f10602O = i7;
            m12761b0(i7);
            m12735P(i7);
            if (z7) {
                mo12711B();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: I */
    protected Object mo12713I(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }

    /* JADX INFO: renamed from: X */
    public final void m12758X(int i7) {
        int i8 = this.f10603P;
        if (i7 < i8) {
            i7 = i8;
        }
        if (i7 != this.f10604Q) {
            this.f10604Q = i7;
            mo12711B();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m12759Y(int i7) {
        if (i7 != this.f10605R) {
            this.f10605R = Math.min(this.f10604Q - this.f10603P, Math.abs(i7));
            mo12711B();
        }
    }

    /* JADX INFO: renamed from: a0 */
    void m12760a0(SeekBar seekBar) {
        int progress = this.f10603P + seekBar.getProgress();
        if (progress != this.f10602O) {
            if (m12739c(Integer.valueOf(progress))) {
                m12757Z(progress, false);
            } else {
                seekBar.setProgress(this.f10602O - this.f10603P);
                m12761b0(this.f10602O);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    void m12761b0(int i7) {
        TextView textView = this.f10608U;
        if (textView != null) {
            textView.setText(String.valueOf(i7));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6873c.f27507h);
    }
}
