package com.anas_mugally.clipboard.p221ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AbstractActivityC2242c;
import androidx.databinding.AbstractC2473f;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.broadcastReceiver.ShowOrHidePrimaryBubbleReceiver;
import com.anas_mugally.clipboard.p221ui.BubbleCustomizationActivity;
import com.google.android.material.slider.InterfaceC4578a;
import com.google.android.material.slider.Slider;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p000.C5379f;
import p145S5.C1444v;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5307m;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p278j6.AbstractC5905g;

/* JADX INFO: loaded from: classes.dex */
public final class BubbleCustomizationActivity extends AbstractActivityC2242c {

    /* JADX INFO: renamed from: Q */
    public static final C3085a f12741Q = new C3085a(null);

    /* JADX INFO: renamed from: O */
    private boolean f12742O;

    /* JADX INFO: renamed from: P */
    private AbstractC5307m f12743P;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.BubbleCustomizationActivity$a */
    public static final class C3085a {
        public /* synthetic */ C3085a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3085a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final void m15369A1(BubbleCustomizationActivity bubbleCustomizationActivity, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        bubbleCustomizationActivity.m15381k1().putBoolean("primaryBubblePositionChangeAuto", z7).apply();
    }

    /* JADX INFO: renamed from: B1 */
    private final void m15370B1() {
        AbstractC5307m abstractC5307m = this.f12743P;
        AbstractC5307m abstractC5307m2 = null;
        if (abstractC5307m == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5307m = null;
        }
        boolean zIsChecked = abstractC5307m.f20289A.isChecked();
        AbstractC5307m abstractC5307m3 = this.f12743P;
        if (abstractC5307m3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5307m2 = abstractC5307m3;
        }
        abstractC5307m2.f20297z.setEnabled(zIsChecked);
        abstractC5307m2.f20296y.setEnabled(zIsChecked);
        abstractC5307m2.f20293v.setEnabled(zIsChecked);
        abstractC5307m2.f20295x.setEnabled(zIsChecked);
        abstractC5307m2.f20292D.setEnabled(zIsChecked);
        abstractC5307m2.f20290B.setEnabled(zIsChecked);
        abstractC5307m2.f20291C.setEnabled(zIsChecked);
    }

    /* JADX INFO: renamed from: j1 */
    private final SharedPreferences m15380j1() {
        SharedPreferences sharedPreferences = getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: k1 */
    private final SharedPreferences.Editor m15381k1() {
        SharedPreferences.Editor editorEdit = m15380j1().edit();
        AbstractC6118n.m27186d(editorEdit, "edit(...)");
        return editorEdit;
    }

    /* JADX INFO: renamed from: l1 */
    private final void m15382l1() {
        this.f12743P = (AbstractC5307m) AbstractC2473f.m10831j(this, R.layout.activity_bubble_customization);
    }

    /* JADX INFO: renamed from: m1 */
    private final void m15383m1() {
        boolean z7 = m15380j1().getBoolean(C3034A.f12453a.m15014A(), true) && !AbstractC3041D.m15080e(this);
        int i7 = m15380j1().getInt("primaryBubbleSize", 40);
        float fM15386p1 = m15386p1(m15380j1().getFloat("primaryBubbleAlpha", 0.6f), 0.01f);
        float fM15386p2 = m15386p1(m15380j1().getFloat("primaryBubbleInEdge", 0.4f), 0.01f);
        float fM15386p3 = m15386p1(m15380j1().getFloat("primaryBubbleYPercentage", 0.5f), 0.01f);
        int i8 = m15380j1().getInt("primaryBubblePositionMode", 1);
        boolean z8 = m15380j1().getBoolean("primaryBubblePositionChangeAuto", true);
        AbstractC5307m abstractC5307m = this.f12743P;
        if (abstractC5307m == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5307m = null;
        }
        abstractC5307m.f20289A.setChecked(z7);
        abstractC5307m.f20297z.setChecked(z8);
        Slider slider = abstractC5307m.f20296y;
        slider.setValue(AbstractC5905g.m26658f(i7, slider.getValueFrom(), abstractC5307m.f20296y.getValueTo()));
        Slider slider2 = abstractC5307m.f20293v;
        float f7 = 100;
        slider2.setValue(AbstractC5905g.m26658f(fM15386p1 * f7, slider2.getValueFrom(), abstractC5307m.f20293v.getValueTo()));
        Slider slider3 = abstractC5307m.f20295x;
        slider3.setValue(AbstractC5905g.m26658f(fM15386p2 * f7, slider3.getValueFrom(), abstractC5307m.f20295x.getValueTo()));
        Slider slider4 = abstractC5307m.f20292D;
        slider4.setValue(AbstractC5905g.m26658f(fM15386p3 * f7, slider4.getValueFrom(), abstractC5307m.f20292D.getValueTo()));
        if (i8 == 1) {
            abstractC5307m.f20291C.setChecked(true);
        } else {
            abstractC5307m.f20290B.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C1444v m15384n1(BubbleCustomizationActivity bubbleCustomizationActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        bubbleCustomizationActivity.finishAndRemoveTask();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C1444v m15385o1(BubbleCustomizationActivity bubbleCustomizationActivity) {
        AbstractC5307m abstractC5307m = bubbleCustomizationActivity.f12743P;
        if (abstractC5307m == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5307m = null;
        }
        abstractC5307m.f20289A.setChecked(true);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: p1 */
    private final float m15386p1(float f7, float f8) {
        return Math.round(f7 / f8) * f8;
    }

    /* JADX INFO: renamed from: q1 */
    private final void m15387q1() {
        m15395y1();
        m15390t1();
        m15388r1();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m15388r1() {
        AbstractC5307m abstractC5307m = this.f12743P;
        if (abstractC5307m == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5307m = null;
        }
        abstractC5307m.f20294w.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l1.G
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i7) {
                BubbleCustomizationActivity.m15389s1(this.f23919a, radioGroup, i7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final void m15389s1(BubbleCustomizationActivity bubbleCustomizationActivity, RadioGroup radioGroup, int i7) {
        AbstractC6118n.m27187e(radioGroup, "<unused var>");
        bubbleCustomizationActivity.m15381k1().putInt("primaryBubblePositionMode", i7 == R.id.radio_left ? -1 : 1).apply();
    }

    /* JADX INFO: renamed from: t1 */
    private final void m15390t1() {
        AbstractC5307m abstractC5307m = this.f12743P;
        if (abstractC5307m == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5307m = null;
        }
        abstractC5307m.f20296y.mo21090m(new InterfaceC4578a() { // from class: l1.C
            @Override // com.google.android.material.slider.InterfaceC4578a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void mo21092a(Slider slider, float f7, boolean z7) {
                BubbleCustomizationActivity.m15391u1(this.f23903a, slider, f7, z7);
            }
        });
        abstractC5307m.f20293v.mo21090m(new InterfaceC4578a() { // from class: l1.D
            @Override // com.google.android.material.slider.InterfaceC4578a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void mo21092a(Slider slider, float f7, boolean z7) {
                BubbleCustomizationActivity.m15392v1(this.f23906a, slider, f7, z7);
            }
        });
        abstractC5307m.f20295x.mo21090m(new InterfaceC4578a() { // from class: l1.E
            @Override // com.google.android.material.slider.InterfaceC4578a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void mo21092a(Slider slider, float f7, boolean z7) {
                BubbleCustomizationActivity.m15393w1(this.f23912a, slider, f7, z7);
            }
        });
        abstractC5307m.f20292D.mo21090m(new InterfaceC4578a() { // from class: l1.F
            @Override // com.google.android.material.slider.InterfaceC4578a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void mo21092a(Slider slider, float f7, boolean z7) {
                BubbleCustomizationActivity.m15394x1(this.f23916a, slider, f7, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final void m15391u1(BubbleCustomizationActivity bubbleCustomizationActivity, Slider slider, float f7, boolean z7) {
        AbstractC6118n.m27187e(slider, "<unused var>");
        bubbleCustomizationActivity.m15381k1().putInt("primaryBubbleSize", (int) f7).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final void m15392v1(BubbleCustomizationActivity bubbleCustomizationActivity, Slider slider, float f7, boolean z7) {
        AbstractC6118n.m27187e(slider, "<unused var>");
        bubbleCustomizationActivity.m15381k1().putFloat("primaryBubbleAlpha", f7 / 100).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final void m15393w1(BubbleCustomizationActivity bubbleCustomizationActivity, Slider slider, float f7, boolean z7) {
        AbstractC6118n.m27187e(slider, "<unused var>");
        bubbleCustomizationActivity.m15381k1().putFloat("primaryBubbleInEdge", f7 / 100).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final void m15394x1(BubbleCustomizationActivity bubbleCustomizationActivity, Slider slider, float f7, boolean z7) {
        AbstractC6118n.m27187e(slider, "<unused var>");
        bubbleCustomizationActivity.m15381k1().putFloat("primaryBubbleYPercentage", f7 / 100).apply();
    }

    /* JADX INFO: renamed from: y1 */
    private final void m15395y1() {
        AbstractC5307m abstractC5307m = this.f12743P;
        AbstractC5307m abstractC5307m2 = null;
        if (abstractC5307m == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5307m = null;
        }
        abstractC5307m.f20289A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l1.A
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BubbleCustomizationActivity.m15396z1(this.f23895a, compoundButton, z7);
            }
        });
        AbstractC5307m abstractC5307m3 = this.f12743P;
        if (abstractC5307m3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5307m2 = abstractC5307m3;
        }
        abstractC5307m2.f20297z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l1.B
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BubbleCustomizationActivity.m15369A1(this.f23898a, compoundButton, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final void m15396z1(BubbleCustomizationActivity bubbleCustomizationActivity, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (!AbstractC3041D.m15080e(bubbleCustomizationActivity)) {
            bubbleCustomizationActivity.m15370B1();
            Intent intent = new Intent(bubbleCustomizationActivity, (Class<?>) ShowOrHidePrimaryBubbleReceiver.class);
            intent.setAction("com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION");
            intent.putExtra("state", z7);
            bubbleCustomizationActivity.sendBroadcast(intent);
            return;
        }
        if (z7) {
            bubbleCustomizationActivity.f12742O = true;
            AbstractC5307m abstractC5307m = bubbleCustomizationActivity.f12743P;
            if (abstractC5307m == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5307m = null;
            }
            abstractC5307m.f20289A.setChecked(false);
            C3034A.f12453a.m15030d(bubbleCustomizationActivity);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m15382l1();
        m15383m1();
        m15387q1();
        m15370B1();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: l1.y
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return BubbleCustomizationActivity.m15384n1(this.f24082a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f12742O) {
            C5379f.m24387e(new C5379f(this, new InterfaceC5356a() { // from class: l1.z
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return BubbleCustomizationActivity.m15385o1(this.f24087a);
                }
            }), 0L, 1, null);
            this.f12742O = false;
        }
    }
}
