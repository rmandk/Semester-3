import streamlit as st

st.title("🦠 Sistem Diagnosa COVID-19")

kehilangan_penciuman = st.radio(
    "Kehilangan penciuman?",
    options=[0, 1],
    format_func=lambda x: "Tidak" if x == 0 else "Ya"
)

demam = st.radio(
    "Demam?",
    options=[0, 1],
    format_func=lambda x: "Tidak" if x == 0 else "Ya"
)

batuk = st.radio(
    "Batuk?",
    options=[0, 1],
    format_func=lambda x: "Tidak" if x == 0 else "Ya"
)

kelelahan = st.radio(
    "Kelelahan?",
    options=[0, 1],
    format_func=lambda x: "Tidak" if x == 0 else "Ya"
)

sesak_nafas = st.radio(
    "Sesak nafas?",
    options=[0, 1],
    format_func=lambda x: "Tidak" if x == 0 else "Ya"
)

if st.button("🔍 Diagnosa"):
    if kehilangan_penciuman == 1:
        if demam == 1:
            if sesak_nafas == 1:
                diagnosa = "COVID-19"
            else:
                diagnosa = "COVID-19"
        else:
            diagnosa = "Flu"
    else:
        if batuk == 1:
            if kelelahan == 1:
                diagnosa = "Flu"
            else:
                diagnosa = "Sehat"
        else:
            diagnosa = "Sehat"

    st.success(f"Hasil Diagnosa: {diagnosa}")
