
document.addEventListener('DOMContentLoaded' , function(){
        let ButtonOpenMonitoringProject = document.getElementById('btn_monitoring');
        let DivMonitoringProject = document.getElementById('all_projects');
        let HedaersProjectAllButtons = document.getElementById('header_projects_all_buttons');
        let buttonCloseAllProject = document.getElementById('btn_close_TableAll');
    ButtonOpenMonitoringProject.addEventListener('click' , function(){

        console.log("Open monitoring Project");
        DivMonitoringProject.style.display = 'block';
        HedaersProjectAllButtons.style.display = 'none';
    });  

    buttonCloseAllProject.addEventListener('click' , function(){

        DivMonitoringProject.style.display = 'none';
        HedaersProjectAllButtons.style.display = 'block';
    });
});


