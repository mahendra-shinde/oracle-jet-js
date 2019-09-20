1. Switch to c: and create a projects directory

    cd \
    mkdir projects
    cd projects

2.  Create new BLANK project and run it 

    ojet create app1 
    cd app1
    ojet serve

3.  Open src/index.html file and add following lines inside `BODY` tag
    
    ```html
    <div class="container"> 
      <div >
        <div class="oj-flex  oj-md-flex-items ">
          <div class="oj-flex-item oj-panel oj-panel-alt1">Item 1</div>
          <div class="oj-flex-item oj-panel oj-panel-alt2">Item 2</div>
        </div>
        <div class="oj-flex oj-lg-flex-items">
          <div class="oj-flex-item oj-panel oj-panel-alt3">Item 4</div>
          <div class="oj-flex-item oj-panel oj-panel-alt4">Item 5</div>
          <div class="oj-flex-item oj-panel " >Item 6</div>
          <div class="oj-flex-item oj-panel">Item 6</div>
        </div>
      </div>
    </div>
    ```

## UI COmponents

1.  Stop existing OJet application (CTRL + C)
2.  Create new application from navbar template

    ```
    $ cd \projects
    $ ojet create app2 --template=navbar
    $ cd app2
    $ ojet serve
    ```
  
3.  Open `src/js/views/about.html` locate text `About content area` 
    On next line write this code:

    ```html
     <oj-buttonset-one>   
        <oj-option>Indian</oj-option>
        <oj-option>NRA</oj-option>
        <oj-option>OCI</oj-option>
    </oj-buttonset-one>
    ```

4.  Open `src/main.js` locate 'require(' function
    append few more modules:
       'ojs/ojinputtext', 'ojs/ojlabel', 'ojs/ojformlayout'

5.  Open `src/js/views/incidents.html` and add following lines:
  ```html
  <div id="form-container">
      <oj-form-layout max-columns="3"  direction="row">
      <oj-label >User name:</oj-label>      
      <oj-input-text value="User Name" ></oj-input-text>
      
      <oj-label >User email:</oj-label>      
      <oj-input-text value="User Email"></oj-input-text>
      </oj-form-layout>
  </div>
  ```